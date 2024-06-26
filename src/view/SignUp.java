/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import common.Utils;
import dao.UserDao;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;
import model.User;



public class SignUp extends javax.swing.JFrame {

    private final String emailPattern = "^[a-zA-Z0-9]+[@][a-zA-Z0-9]+([.][a-zA-Z0-9]+)+$";
    private final String phoneNumberPattern = "^[0-9]{10}$";

    /**
     * Creates new form SignUp2
     */
    public SignUp() {
        initComponents();
        validateFields();
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        Confirm = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        Phone = new javax.swing.JLabel();
        Address = new javax.swing.JLabel();
        Security = new javax.swing.JLabel();
        Answer = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        txtConfirmPassword = new javax.swing.JPasswordField();
        cbxSex = new javax.swing.JComboBox<>();
        dpBirthDate = new com.toedter.calendar.JDateChooser();
        txtPhoneNumber = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtSecurityQuestion = new javax.swing.JTextField();
        txtAnswer = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnForgot = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jLabel5.setToolTipText("");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 170, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Wellcome!!");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 210, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("If you already have an account please log in here");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 212, 167));
        jLabel1.setText("Sign up");
        jLabel1.setToolTipText("signup");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, -1));

        Name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Name.setForeground(new java.awt.Color(153, 153, 153));
        Name.setText("Full Name");
        jPanel2.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 227, -1, -1));

        Confirm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Confirm.setForeground(new java.awt.Color(153, 153, 153));
        Confirm.setText("Confirm password");
        jPanel2.add(Confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 346, -1, -1));

        Date.setBackground(new java.awt.Color(153, 153, 153));
        Date.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Date.setForeground(new java.awt.Color(153, 153, 153));
        Date.setText("Birth date");
        jPanel2.add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 386, -1, -1));

        Phone.setBackground(new java.awt.Color(153, 153, 153));
        Phone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Phone.setForeground(new java.awt.Color(153, 153, 153));
        Phone.setText("Phone number");
        jPanel2.add(Phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 424, -1, 20));

        Address.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Address.setForeground(new java.awt.Color(153, 153, 153));
        Address.setText("Address");
        jPanel2.add(Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 465, -1, 20));

        Security.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Security.setForeground(new java.awt.Color(153, 153, 153));
        Security.setText("Security question ");
        jPanel2.add(Security, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 506, -1, -1));

        Answer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Answer.setForeground(new java.awt.Color(153, 153, 153));
        Answer.setText("Answer");
        jPanel2.add(Answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 547, -1, -1));

        Email.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Email.setForeground(new java.awt.Color(153, 153, 153));
        Email.setText("email");
        jPanel2.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 260, -1, 30));

        Password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Password.setForeground(new java.awt.Color(153, 153, 153));
        Password.setText("Password");
        jPanel2.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 306, -1, -1));

        txtName.setBackground(new java.awt.Color(250, 242, 228));
        txtName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 400, 30));

        txtEmail.setBackground(new java.awt.Color(250, 242, 228));
        txtEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 400, 30));

        txtPassword.setBackground(new java.awt.Color(250, 242, 228));
        txtPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 400, 30));

        txtConfirmPassword.setBackground(new java.awt.Color(250, 242, 228));
        txtConfirmPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtConfirmPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConfirmPasswordKeyReleased(evt);
            }
        });
        jPanel2.add(txtConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 400, 30));

        cbxSex.setBackground(new java.awt.Color(250, 242, 228));
        cbxSex.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbxSex.setForeground(new java.awt.Color(153, 153, 153));
        cbxSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        cbxSex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSexActionPerformed(evt);
            }
        });
        jPanel2.add(cbxSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 190, 30));

        dpBirthDate.setBackground(new java.awt.Color(250, 242, 228));
        dpBirthDate.setForeground(new java.awt.Color(153, 153, 153));
        dpBirthDate.setToolTipText("");
        dpBirthDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dpBirthDate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dpBirthDatePropertyChange(evt);
            }
        });
        jPanel2.add(dpBirthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 190, 30));

        txtPhoneNumber.setBackground(new java.awt.Color(250, 242, 228));
        txtPhoneNumber.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });
        txtPhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPhoneNumberKeyReleased(evt);
            }
        });
        jPanel2.add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 400, 30));

        txtAddress.setBackground(new java.awt.Color(250, 242, 228));
        txtAddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddressKeyReleased(evt);
            }
        });
        jPanel2.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 400, 30));

        txtSecurityQuestion.setBackground(new java.awt.Color(250, 242, 228));
        txtSecurityQuestion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSecurityQuestion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSecurityQuestionKeyReleased(evt);
            }
        });
        jPanel2.add(txtSecurityQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, 400, 30));

        txtAnswer.setBackground(new java.awt.Color(250, 242, 228));
        txtAnswer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAnswer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAnswerKeyReleased(evt);
            }
        });
        jPanel2.add(txtAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 540, 400, 30));

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(240, 212, 167));
        btnSave.setText("Save ");
        btnSave.setBorderPainted(false);
        btnSave.setContentAreaFilled(false);
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel2.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 580, -1, -1));

        btnForgot.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnForgot.setForeground(new java.awt.Color(240, 212, 167));
        btnForgot.setText("Forgot password?");
        btnForgot.setBorderPainted(false);
        btnForgot.setContentAreaFilled(false);
        btnForgot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnForgot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForgotActionPerformed(evt);
            }
        });
        jPanel2.add(btnForgot, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 580, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 700, 770));

        jPanel1.setBackground(new java.awt.Color(240, 212, 167));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogin.setBackground(new java.awt.Color(247, 231, 206));
        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setBorderPainted(false);
        btnLogin.setContentAreaFilled(false);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:

        UserDao userDao = new UserDao();
        if (userDao.getByEmail(txtEmail.getText()) != null) {
            JOptionPane.showMessageDialog(null, "Email already used!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        User user = new User();
        user.setFullName(txtName.getText());
        user.setEmail(txtEmail.getText());
        user.setPassword(txtPassword.getText());
        user.setSex((String) cbxSex.getSelectedItem());
        user.setBirthDate(Utils.toLocalDate(dpBirthDate.getDate()));
        user.setPhoneNumber(txtPhoneNumber.getText());
        user.setAddress(txtAddress.getText());
        user.setSecurityQuestion(txtSecurityQuestion.getText());
        user.setAnswer(txtAnswer.getText());

        
        
        userDao.create(user);
        clear();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        validateFields();
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        validateFields();
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        validateFields();
    }//GEN-LAST:event_txtPasswordKeyReleased

    private void txtConfirmPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmPasswordKeyReleased
        validateFields();
    }//GEN-LAST:event_txtConfirmPasswordKeyReleased

    private void dpBirthDatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dpBirthDatePropertyChange
        validateFields();
    }//GEN-LAST:event_dpBirthDatePropertyChange

    private void txtPhoneNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNumberKeyReleased
        validateFields();
    }//GEN-LAST:event_txtPhoneNumberKeyReleased

    private void txtAddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyReleased
        validateFields();
    }//GEN-LAST:event_txtAddressKeyReleased

    private void txtSecurityQuestionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSecurityQuestionKeyReleased
        validateFields();
    }//GEN-LAST:event_txtSecurityQuestionKeyReleased

    private void txtAnswerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnswerKeyReleased
        validateFields();
    }//GEN-LAST:event_txtAnswerKeyReleased

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Do you want to close Application", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void cbxSexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxSexActionPerformed

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    private void btnForgotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForgotActionPerformed
        setVisible(false);
        new NewForgotPasswordPage().setVisible(true);
    }//GEN-LAST:event_btnForgotActionPerformed

    public void validateFields() {
        String name = txtName.getText();
        String email = txtEmail.getText();
        String password = txtPassword.getText();
        String confirmPassword = txtConfirmPassword.getText();
        String phoneNumber = txtPhoneNumber.getText();
        String address = txtAddress.getText();
        LocalDate birthDate = Utils.toLocalDate(dpBirthDate.getDate());
        String securityQuestion = txtSecurityQuestion.getText();
        String answer = txtAnswer.getText();
        System.out.println(!name.isEmpty());
        System.out.println(email.matches(emailPattern));
        System.out.println(phoneNumber.matches(phoneNumberPattern));
        System.out.println(!address.isEmpty());
        System.out.println(!password.isEmpty());
        System.out.println(confirmPassword.equals(password));
        System.out.println(birthDate != null && birthDate.isBefore(LocalDate.now()));
        System.out.println(!securityQuestion.isEmpty());
        System.out.println(!answer.isEmpty());
        System.out.println();
        if (!name.isEmpty() && email.matches(emailPattern) && phoneNumber.matches(phoneNumberPattern)
                && !address.isEmpty()
                && !password.isEmpty() && confirmPassword.equals(password)
                && birthDate != null && birthDate.isBefore(LocalDate.now())
                && !securityQuestion.isEmpty() && !answer.isEmpty()) {
            btnSave.setEnabled(true);
        } else {
            btnSave.setEnabled(false);
        }
        if (password.equals("")) {
            Password.setVisible(true);
        } else {
            Password.setVisible(false);
        }
        if (email.equals("")) {
            Email.setVisible(true);
        } else {
            Email.setVisible(false);
        }
        if (name.equals("")) {
            Name.setVisible(true);
        } else {
            Name.setVisible(false);
        }
        if (confirmPassword.equals("")) {
            Confirm.setVisible(true);
        } else {
            Confirm.setVisible(false);
        }
        if (phoneNumber.equals("")) {
            Phone.setVisible(true);
        } else {
            Phone.setVisible(false);
        }
        if (address.equals("")) {
            Address.setVisible(true);
        } else {
            Address.setVisible(false);
        }
        if (dpBirthDate.getDate() == null) {
            Date.setVisible(true);
        } else {
            Date.setVisible(false);
        }
        if (securityQuestion.equals("")) {
            Security.setVisible(true);
        } else {
            Security.setVisible(false);
        }
        if (answer.equals("")) {
            Answer.setVisible(true);
        } else {
            Answer.setVisible(false);
        }
        
    }

    public void clear() {
        txtName.setText("");
        txtEmail.setText("");
        txtPassword.setText("");
        txtConfirmPassword.setText("");
        cbxSex.setSelectedIndex(0);
        dpBirthDate.setDate(null);
        txtPhoneNumber.setText("");
        txtAddress.setText("");
        txtSecurityQuestion.setText("");
        txtAnswer.setText("");
        btnSave.setEnabled(false);
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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address;
    private javax.swing.JLabel Answer;
    private javax.swing.JLabel Confirm;
    private javax.swing.JLabel Date;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Password;
    private javax.swing.JLabel Phone;
    private javax.swing.JLabel Security;
    private javax.swing.JButton btnForgot;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbxSex;
    private com.toedter.calendar.JDateChooser dpBirthDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAnswer;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtSecurityQuestion;
    // End of variables declaration//GEN-END:variables
}
