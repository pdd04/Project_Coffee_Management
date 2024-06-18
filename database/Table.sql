﻿-- Xóa bảng
DROP TABLE IF EXISTS CartItem;
DROP TABLE IF EXISTS OrderDetails;
DROP TABLE IF EXISTS [Order];
DROP TABLE IF EXISTS Status;
DROP TABLE IF EXISTS DeliveryInfo;
DROP TABLE IF EXISTS PaymentInfo;
DROP TABLE IF EXISTS PaymentMethod;
DROP TABLE IF EXISTS Staff;
DROP TABLE IF EXISTS Product;
DROP TABLE IF EXISTS Category;
DROP TABLE IF EXISTS [User];

-- Bảng User
CREATE TABLE [User] (
	Id INT PRIMARY KEY IDENTITY(1,1),
	Email VARCHAR(100) UNIQUE NOT NULL,
	Password VARCHAR(100) NOT NULL,
	FullName VARCHAR(100) NOT NULL,
	Sex VARCHAR(10) NOT NULL,
	BirthDate DATE,
	PhoneNumber VARCHAR(12),
	Address VARCHAR(100),
	SecurityQuestion VARCHAR(200) NOT NULL,
	Answer VARCHAR(200) NOT NULL,
	CreatedAt DATETIME DEFAULT CURRENT_TIMESTAMP,
	IsApproved BIT DEFAULT 1,
);

INSERT INTO [User] (Email, Password, FullName, Sex, BirthDate, PhoneNumber, Address, SecurityQuestion, Answer, IsApproved)
VALUES ('admin@gmail.com', 'admin', 'Admin', 'Null', '1900-01-01', '0123456789', 'None', 'Why is dark humor like food?', 'Because not everybody gets it', 1),
('duy@gmail.com', 'admin', 'Duy', 'Null', '1900-01-01', '0123456780', 'None', 'Why is dark humor like food?', 'Because not everybody gets it', 1),
('huy@gmail.com', 'admin', 'Huy', 'Null', '1900-01-01', '0123456781', 'None', 'Why is dark humor like food?', 'Because not everybody gets it', 1);

-- Bảng DeliveryInfo
CREATE TABLE DeliveryInfo (
	Id INT PRIMARY KEY IDENTITY(1,1),
	UserId INT NOT NULL,
	RecipientName VARCHAR(100) NOT NULL,
	PhoneNumber VARCHAR(12) NOT NULL,
	Address VARCHAR(100) NOT NULL,
	FOREIGN KEY (UserId) REFERENCES [User](Id) ON DELETE CASCADE
);

-- Bảng PaymentInfo
CREATE TABLE PaymentInfo (
    Id INT PRIMARY KEY IDENTITY(1,1),
    UserId INT NOT NULL,
    CardNumber VARCHAR(20) NOT NULL,
    ExpMonth INT NOT NULL,
    ExpYear INT NOT NULL,
    SecurityCode VARCHAR(10) NOT NULL,
    OwnerName VARCHAR(100),
    BillingAddress1 VARCHAR(100),
    BillingAddress2 VARCHAR(100),
    City VARCHAR(50),
    ZipCode VARCHAR(6),
    Country VARCHAR(50),
	FOREIGN KEY (UserId) REFERENCES [User](Id) ON DELETE CASCADE
);

-- Bảng PaymentMethod
CREATE TABLE PaymentMethod (
	Id INT PRIMARY KEY,
    Name VARCHAR(50)
);

INSERT INTO PaymentMethod (Id, Name) VALUES (1, 'Credit card');
INSERT INTO PaymentMethod (Id, Name) VALUES (2, 'Cash on delivery');

-- Bảng Category
CREATE TABLE Category (
	Id INT PRIMARY KEY IDENTITY(1,1),
    Name VARCHAR(50) NOT NULL
);
              
INSERT INTO Category (Name)
VALUES
	('Beverages'), 
        ('Pastries'),
        ('Sandwiches'),
        ('Salads'),
        ('Desserts'),
        ('Smoothies'),
        ('Breakfast'),
        ('Wraps'),
        ('Soup'),
        ('Hand brew'),
        ('Espresso'),
        ('tea');

-- Bảng Product
CREATE TABLE Product (
	Id INT PRIMARY KEY IDENTITY(1,1),
    Name VARCHAR(50) NOT NULL,
    CategoryId INT NOT NULL,
    Price DECIMAL(10,2) NOT NULL,
    FOREIGN KEY (CategoryId) REFERENCES Category(Id)
);
INSERT INTO Product (Name, Price, CategoryId)
VALUES
	('Espresso', 2.50, 11),
                ('Cappuccino', 3.00, 11),
                ('Latte', 3.50, 11),
                ('Pour Over', 3.50, 10),
                ('French Press', 3, 10),
                ('Cold Brew', 2.5, 10),
                ('Cold Drip', 2.5, 10),
                ('long black', 2.5, 11),
                ('Syphon', 3, 10),
                ('Milk Tea', 2, 12),
                ('Croissant', 2.00, 2),
                ('Chocolate Muffin', 2.50, 2),
                ('Ham and Cheese', 4.50, 3),
                ('Club Sandwich', 5.50, 3),
                ('Caesar Salad', 6.00, 4),
                ('Greek Salad', 5.50, 4),
                ('Cheesecake', 4.50, 5),
                ('Apple Pie', 3.50, 5),
                ('Strawberry Smoothie', 4.00, 6),
                ('Mango Madness Smoothie', 4.50, 6),
                ('Pancakes', 5.50, 7),
                ('Omelette', 6.00, 7),
                ('Chicken Wrap', 5.50, 8),
                ('Vegetable Wrap', 4.50, 8),
                ('Tomato Soup', 3.50, 9),
                ('Mushroom Soup', 3.00, 9),
                ('Iced Tea', 2.50, 12),
                ('Fruit Salad', 4.50, 5),
                ('Blueberry Muffin', 2.50, 2),
                ('Tuna Sandwich', 5.50, 3),
                ('Chicken Caesar Salad', 6.50, 4),
                ('Brownie', 3.00, 5),
                ('Banana Smoothie', 4.00, 6),
                ('Bagel', 2.50, 7),
                ('Turkey Wrap', 5.50, 8),
                ('Minestrone Soup', 3.50, 9),
                ('Frappe', 4.50, 1),
                ('Donut', 1.50, 2),
                ('Grilled Cheese Sandwich', 4.00, 3),
                ('Cobb Salad', 7.00, 4),
                ('Mango Tango Smoothie', 5.50, 6),
                ('French Toast', 5.00, 7),
                ('Veggie Wrap', 4.50, 8),
                ('Lentil Soup', 3.00, 9),
                ('Mocha', 3.50, 11),
                ('Cherry Pie', 4.00, 5),
                ('Blueberry Smoothie', 4.50, 6),
                ('Scone', 2.00, 2),
                ('Roast Beef Sandwich', 6.00, 3),
                ('Caprese Salad', 5.50, 4),
                ('Ice Cream Sundae', 5.50, 5),
                ('Green Smoothie', 4.00, 6),
                ('Egg Sandwich', 4.50, 7),
                ('Chicken Caesar Wrap', 6.50, 8),
                ('Clam Chowder', 4.50, 9),
                ('Hot Chocolate', 3.00, 1),
                ('Lemon Tart', 3.50, 5);

-- Bảng Order
CREATE TABLE [Order] (
	Id INT PRIMARY KEY IDENTITY(1,1),
    UserId INT NOT NULL,
    CreatedAt DATETIME DEFAULT CURRENT_TIMESTAMP,
    TotalCost DECIMAL(10,2) NOT NULL,
    ShipCost DECIMAL(10,2),
    Discount DECIMAL(10,2) DEFAULT 0,
    FinalCost AS (TotalCost + ShipCost - Discount),
    DeliveryInfoId INT NOT NULL,
    PaymentMethod INT NOT NULL,
    PaymentInfoId INT,
    ShipperId INT,
    StatusId INT,
    FOREIGN KEY (UserId) REFERENCES [User](Id) ON DELETE CASCADE,
	FOREIGN KEY (DeliveryInfoId) REFERENCES DeliveryInfo(Id),
    FOREIGN KEY (PaymentMethod) REFERENCES PaymentMethod(Id),
    FOREIGN KEY (PaymentInfoId) REFERENCES PaymentInfo(Id),
    FOREIGN KEY (ShipperId) REFERENCES Staff(Id) ON DELETE SET NULL,
    FOREIGN KEY (StatusId) REFERENCES Status(Id)
); 

-- Bảng OrderDetails
CREATE TABLE OrderDetails (
	Id INT PRIMARY KEY IDENTITY(1,1),
    OrderId INT NOT NULL,
    ProductId INT,
    Quantity INT NOT NULL,
    UnitPrice DECIMAL(10,2),
    TotalAmount AS (UnitPrice * Quantity),
    FOREIGN KEY (OrderId) REFERENCES [Order](Id) ON DELETE CASCADE,
    FOREIGN KEY (ProductId) REFERENCES Product(Id) ON DELETE SET NULL
);

-- Bảng Staff
CREATE TABLE Staff (
	Id INT PRIMARY KEY IDENTITY(1,1),
    FullName VARCHAR(100) NOT NULL,
    Sex VARCHAR(10) NOT NULL,
    BirthDate DATE NOT NULL,
    PhoneNumber VARCHAR(12),
    Position VARCHAR(20),
    StartDate DATE,
    EndDate DATE,
    MonthlySalary DECIMAL(10,2)
);

-- Bảng CartItem
CREATE TABLE CartItem (
	Id INT PRIMARY KEY IDENTITY(1,1),
    UserId INT NOT NULL,
    ProductId INT NOT NULL,
    Quantity INT NOT NULL,
    FOREIGN KEY (UserId) REFERENCES [User](Id) ON DELETE CASCADE,
    FOREIGN KEY (ProductId) REFERENCES Product(Id) ON DELETE CASCADE,
);

-- Bảng Status
CREATE TABLE Status (
	Id INT PRIMARY KEY,
    Value VARCHAR(50)
);

INSERT INTO Status (Id, Value) VALUES (1, 'Pending'), (2, 'Accepted'), (3, 'Delivering'), (4, 'Delivered');
