/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.PaymentInfoDao;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;
import java.util.List;
import model.PaymentInfo;


public class AddPaymentInfo extends javax.swing.JFrame {

    /**
     * Creates new form AddPaymentInfo
     */
    public AddPaymentInfo() {
        initComponents();
    }

    private int userId;
    private PlaceOrderView placeOrderView;

    public AddPaymentInfo(int userId, PlaceOrderView placeOrderView) {
        this();
        this.userId = userId;
        this.placeOrderView = placeOrderView;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Card = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Security = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        Address1 = new javax.swing.JLabel();
        Year = new javax.swing.JLabel();
        Address2 = new javax.swing.JLabel();
        City = new javax.swing.JLabel();
        Zip = new javax.swing.JLabel();
        Month = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        txtBillAddr1 = new javax.swing.JTextField();
        txtExpMonth = new javax.swing.JTextField();
        txtBillAddr2 = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtZipCode = new javax.swing.JTextField();
        txtOwnerName = new javax.swing.JTextField();
        txtSecCode = new javax.swing.JTextField();
        txtExpYear = new javax.swing.JTextField();
        txtCardNumber = new javax.swing.JTextField();
        cbxCountry = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Card.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Card.setForeground(new java.awt.Color(153, 153, 153));
        Card.setText("Card Number *");
        jPanel1.add(Card, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 128, 120, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 212, 167));
        jLabel1.setText("New Payment Info");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 212, 167));
        jLabel7.setText("/");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 10, 30));

        Security.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Security.setForeground(new java.awt.Color(153, 153, 153));
        Security.setText("Security Code *");
        jPanel1.add(Security, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 208, -1, -1));

        Name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Name.setForeground(new java.awt.Color(153, 153, 153));
        Name.setText("Owner Name *");
        jPanel1.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 248, -1, -1));

        Address1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Address1.setForeground(new java.awt.Color(153, 153, 153));
        Address1.setText("Billing Address Line 1");
        jPanel1.add(Address1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 287, -1, -1));

        Year.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Year.setForeground(new java.awt.Color(153, 153, 153));
        Year.setText("Year");
        jPanel1.add(Year, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 168, -1, -1));

        Address2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Address2.setForeground(new java.awt.Color(153, 153, 153));
        Address2.setText("Billing Address Line 2");
        jPanel1.add(Address2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 328, -1, -1));

        City.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        City.setForeground(new java.awt.Color(153, 153, 153));
        City.setText("City");
        jPanel1.add(City, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 368, -1, -1));

        Zip.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Zip.setForeground(new java.awt.Color(153, 153, 153));
        Zip.setText("Zip Code");
        jPanel1.add(Zip, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 408, -1, -1));

        Month.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Month.setForeground(new java.awt.Color(153, 153, 153));
        Month.setText("Month");
        jPanel1.add(Month, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 168, -1, -1));

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClear.setForeground(new java.awt.Color(225, 169, 80));
        btnClear.setText("Clear");
        btnClear.setBorderPainted(false);
        btnClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 490, -1, -1));

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(225, 169, 80));
        btnSave.setText("Save");
        btnSave.setBorderPainted(false);
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, -1, -1));

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, -1, -1));

        txtBillAddr1.setBackground(new java.awt.Color(250, 242, 228));
        txtBillAddr1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtBillAddr1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBillAddr1KeyReleased(evt);
            }
        });
        jPanel1.add(txtBillAddr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 291, 30));

        txtExpMonth.setBackground(new java.awt.Color(250, 242, 228));
        txtExpMonth.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtExpMonth.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtExpMonthKeyReleased(evt);
            }
        });
        jPanel1.add(txtExpMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 130, 30));

        txtBillAddr2.setBackground(new java.awt.Color(250, 242, 228));
        txtBillAddr2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtBillAddr2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBillAddr2KeyReleased(evt);
            }
        });
        jPanel1.add(txtBillAddr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 291, 30));

        txtCity.setBackground(new java.awt.Color(250, 242, 228));
        txtCity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCityKeyReleased(evt);
            }
        });
        jPanel1.add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 291, 30));

        txtZipCode.setBackground(new java.awt.Color(250, 242, 228));
        txtZipCode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtZipCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtZipCodeKeyReleased(evt);
            }
        });
        jPanel1.add(txtZipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 291, 30));

        txtOwnerName.setBackground(new java.awt.Color(250, 242, 228));
        txtOwnerName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtOwnerName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtOwnerNameKeyReleased(evt);
            }
        });
        jPanel1.add(txtOwnerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 291, 30));

        txtSecCode.setBackground(new java.awt.Color(250, 242, 228));
        txtSecCode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSecCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSecCodeKeyReleased(evt);
            }
        });
        jPanel1.add(txtSecCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 291, 30));

        txtExpYear.setBackground(new java.awt.Color(250, 242, 228));
        txtExpYear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtExpYear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtExpYearKeyReleased(evt);
            }
        });
        jPanel1.add(txtExpYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 130, 30));

        txtCardNumber.setBackground(new java.awt.Color(250, 242, 228));
        txtCardNumber.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCardNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCardNumberKeyReleased(evt);
            }
        });
        jPanel1.add(txtCardNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 291, 30));

        cbxCountry.setBackground(new java.awt.Color(250, 242, 228));
        cbxCountry.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbxCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCountryActionPerformed(evt);
            }
        });
        jPanel1.add(cbxCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 291, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void txtCardNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCardNumberKeyReleased
        validateFields();
    }//GEN-LAST:event_txtCardNumberKeyReleased

    private void txtExpYearKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtExpYearKeyReleased
        validateFields();
    }//GEN-LAST:event_txtExpYearKeyReleased

    private void txtSecCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSecCodeKeyReleased
        validateFields();
    }//GEN-LAST:event_txtSecCodeKeyReleased

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        PaymentInfo paymentInfo = new PaymentInfo();
        paymentInfo.setUserId(userId);
        paymentInfo.setCardNumber(txtCardNumber.getText());
        paymentInfo.setExpMonth(Integer.parseInt(txtExpMonth.getText()));
        paymentInfo.setExpYear(Integer.parseInt(txtExpYear.getText()) + LocalDate.now().getYear() / 100 * 100);
        paymentInfo.setSecurityCode(txtSecCode.getText());
        paymentInfo.setOwnerName(txtOwnerName.getText());
        paymentInfo.setBillingAddress1(txtBillAddr1.getText());
        paymentInfo.setBillingAddress2(txtBillAddr2.getText());
        paymentInfo.setCity(txtCity.getText());
        paymentInfo.setZipCode(txtZipCode.getText());
        paymentInfo.setCountry((String) cbxCountry.getSelectedItem());
        PaymentInfoDao.getInstance().add(paymentInfo);
        setVisible(false);
        placeOrderView.loadPaymentInfos();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtCardNumber.setText("");
        txtExpMonth.setText("");
        txtExpYear.setText("");
        txtSecCode.setText("");
        txtOwnerName.setText("");
        txtBillAddr1.setText("");
        txtBillAddr2.setText("");
        txtCity.setText("");
        txtZipCode.setText("");
        cbxCountry.setSelectedIndex(0);
        btnSave.setEnabled(false);
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtOwnerNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOwnerNameKeyReleased
        validateFields();
    }//GEN-LAST:event_txtOwnerNameKeyReleased

    private void txtBillAddr1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBillAddr1KeyReleased
        validateFields();
    }//GEN-LAST:event_txtBillAddr1KeyReleased

    private void txtExpMonthKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtExpMonthKeyReleased
        validateFields();
    }//GEN-LAST:event_txtExpMonthKeyReleased

    private void txtBillAddr2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBillAddr2KeyReleased
        validateFields();
    }//GEN-LAST:event_txtBillAddr2KeyReleased

    private void txtCityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCityKeyReleased
        validateFields();
    }//GEN-LAST:event_txtCityKeyReleased

    private void txtZipCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtZipCodeKeyReleased
        validateFields();
    }//GEN-LAST:event_txtZipCodeKeyReleased

    private void cbxCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCountryActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        List.of(
                "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua and Barbuda",
                "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain",
                "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia",
                "Bosnia and Herzegovina", "Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina Faso",
                "Burundi", "Cabo Verde", "Cambodia", "Cameroon", "Canada", "Central African Republic",
                "Chad", "Chile", "China", "Colombia", "Comoros", "Congo, Democratic Republic of the",
                "Congo, Republic of the", "Costa Rica", "Cote d'Ivoire", "Croatia", "Cuba", "Cyprus",
                "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic",
                "East Timor (Timor-Leste)", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea",
                "Eritrea", "Estonia", "Eswatini", "Ethiopia", "Fiji", "Finland", "France", "Gabon",
                "Gambia", "Georgia", "Germany", "Ghana", "Greece", "Grenada", "Guatemala", "Guinea",
                "Guinea-Bissau", "Guyana", "Haiti", "Honduras", "Hungary", "Iceland", "India",
                "Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan",
                "Kazakhstan", "Kenya", "Kiribati", "Korea, North", "Korea, South", "Kosovo", "Kuwait",
                "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya",
                "Liechtenstein", "Lithuania", "Luxembourg", "Madagascar", "Malawi", "Malaysia",
                "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius", "Mexico",
                "Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique",
                "Myanmar (Burma)", "Namibia", "Nauru", "Nepal", "Netherlands", "New Zealand",
                "Nicaragua", "Niger", "Nigeria", "North Macedonia (formerly Macedonia)", "Norway",
                "Oman", "Pakistan", "Palau", "Palestine", "Panama", "Papua New Guinea", "Paraguay",
                "Peru", "Philippines", "Poland", "Portugal", "Qatar", "Romania", "Russia", "Rwanda",
                "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenadines", "Samoa",
                "San Marino", "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles",
                "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia",
                "South Africa", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Sweden",
                "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Togo", "Tonga",
                "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Tuvalu", "Uganda", "Ukraine",
                "United Arab Emirates (UAE)", "United Kingdom (UK)", "United States of America (USA)",
                "Uruguay", "Uzbekistan", "Vanuatu", "Vatican City (Holy See)", "Venezuela", "Vietnam",
                "Yemen", "Zambia", "Zimbabwe"
        ).forEach(cbxCountry::addItem);

        cbxCountry.setSelectedItem("Vietnam");
    }//GEN-LAST:event_formComponentShown

    // check the condition of User's Payment Info
    private void validateFields() {
        try {
            int month = Integer.parseInt(txtExpMonth.getText());
            int year = Integer.parseInt(txtExpYear.getText());
            if (txtCardNumber.getText().matches("[0-9]{16}")
                    && month >= 1 && month <= 12
                    && year >= LocalDate.now().getYear() && year < LocalDate.now().getYear() + 100
                    && LocalDate.of(year + LocalDate.now().getYear() / 100 * 100, month, 1).with(TemporalAdjusters.lastDayOfMonth()).isAfter(LocalDate.now())
                    && txtSecCode.getText().matches("[0-9]{3}")
                    && !txtOwnerName.getText().isEmpty()
                    && (txtZipCode.getText().isEmpty() || txtZipCode.getText().matches("[0-9]+")))
            {
                btnSave.setEnabled(true);
            } else {
                btnSave.setEnabled(false);
            }
        } catch (Exception ex) {
            btnSave.setEnabled(false);
        }
        if (txtCardNumber.getText().equals("")) {
            Card.setVisible(true);
        } else {
            Card.setVisible(false);
        }
        if (txtExpMonth.getText().equals("")) {
            Month.setVisible(true);
        } else {
            Month.setVisible(false);
        }if (txtExpYear.getText().equals("")) {
            Year.setVisible(true);
        } else {
            Year.setVisible(false);
        }if (txtSecCode.getText().equals("")) {
            Security.setVisible(true);
        } else {
            Security.setVisible(false);
        }if (txtOwnerName.getText().equals("")) {
            Name.setVisible(true);
        } else {
            Name.setVisible(false);
        }
        if (txtBillAddr1.getText().equals("")) {
            Address1.setVisible(true);
        } else {
            Address1.setVisible(false);
        }if (txtBillAddr2.getText().equals("")) {
            Address2.setVisible(true);
        } else {
            Address2.setVisible(false);
        }if (txtCity.getText().equals("")) {
            City.setVisible(true);
        } else {
            City.setVisible(false);
        }if (txtZipCode.getText().equals("")) {
            Zip.setVisible(true);
        } else {
            Zip.setVisible(false);
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddPaymentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPaymentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPaymentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPaymentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPaymentInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address1;
    private javax.swing.JLabel Address2;
    private javax.swing.JLabel Card;
    private javax.swing.JLabel City;
    private javax.swing.JLabel Month;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Security;
    private javax.swing.JLabel Year;
    private javax.swing.JLabel Zip;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbxCountry;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtBillAddr1;
    private javax.swing.JTextField txtBillAddr2;
    private javax.swing.JTextField txtCardNumber;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtExpMonth;
    private javax.swing.JTextField txtExpYear;
    private javax.swing.JTextField txtOwnerName;
    private javax.swing.JTextField txtSecCode;
    private javax.swing.JTextField txtZipCode;
    // End of variables declaration//GEN-END:variables
}
