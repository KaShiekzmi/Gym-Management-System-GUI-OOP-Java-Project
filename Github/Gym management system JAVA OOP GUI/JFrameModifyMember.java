package project_oop;
import java.io.IOException;
import javax.swing.JOptionPane;
public class JFrameModifyMember extends javax.swing.JFrame {
    Gym gym = new Gym();
    Member member = new Member();
    Payment payment = new Payment();
    public JFrameModifyMember() {
        initComponents();
        txtNewName.setEditable(false);
        txtNewGmail.setEditable(false);
        txtNewPhoneNo.setEditable(false);
        txtNewAddress.setEditable(false);
        txtNewHeight.setEditable(false);
        txtNewWeight.setEditable(false);
        txtNewOutStandingBalance.setEditable(false);
        txtNewCCAccountHolder.setEditable(false);
        txtNewCreditCardNumber.setEditable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtRegNo = new javax.swing.JTextField();
        txtNewPhoneNo = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtNewAddress = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNewName = new javax.swing.JTextField();
        btnSearchMember = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtNewGmail = new javax.swing.JTextField();
        radioBtnOther = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        radioBtnMale = new javax.swing.JRadioButton();
        jLabel21 = new javax.swing.JLabel();
        radioBtnFemale = new javax.swing.JRadioButton();
        txtNewHeight = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtNewWeight = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        radioBtnWeightLoss = new javax.swing.JRadioButton();
        radioBtnMuscleGain = new javax.swing.JRadioButton();
        radioBtnShredding = new javax.swing.JRadioButton();
        txtNewOutStandingBalance = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtNewCCAccountHolder = new javax.swing.JTextField();
        txtNewCreditCardNumber = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnBack1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(35, 43, 42));

        txtRegNo.setBackground(new java.awt.Color(35, 43, 42));
        txtRegNo.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtRegNo.setForeground(new java.awt.Color(255, 255, 255));
        txtRegNo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtRegNo.setMargin(new java.awt.Insets(2, 1, 2, 1));
        txtRegNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegNoActionPerformed(evt);
            }
        });

        txtNewPhoneNo.setBackground(new java.awt.Color(35, 43, 42));
        txtNewPhoneNo.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtNewPhoneNo.setForeground(new java.awt.Color(255, 255, 255));
        txtNewPhoneNo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtNewPhoneNo.setMargin(new java.awt.Insets(2, 1, 2, 1));
        txtNewPhoneNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewPhoneNoActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Address:");

        txtNewAddress.setBackground(new java.awt.Color(35, 43, 42));
        txtNewAddress.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtNewAddress.setForeground(new java.awt.Color(255, 255, 255));
        txtNewAddress.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtNewAddress.setMargin(new java.awt.Insets(2, 1, 2, 1));
        txtNewAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewAddressActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Name:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("*Write data in those fields which you want to update, otherwise leave empty it before save*");

        txtNewName.setBackground(new java.awt.Color(35, 43, 42));
        txtNewName.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtNewName.setForeground(new java.awt.Color(255, 255, 255));
        txtNewName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtNewName.setMargin(new java.awt.Insets(2, 1, 2, 1));
        txtNewName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewNameActionPerformed(evt);
            }
        });

        btnSearchMember.setBackground(new java.awt.Color(17, 122, 102));
        btnSearchMember.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSearchMember.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchMember.setText("SEARCH MEMBER");
        btnSearchMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchMemberActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Search member with reg id:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Gender:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Gmail:");

        txtNewGmail.setBackground(new java.awt.Color(35, 43, 42));
        txtNewGmail.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtNewGmail.setForeground(new java.awt.Color(255, 255, 255));
        txtNewGmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtNewGmail.setMargin(new java.awt.Insets(2, 1, 2, 1));
        txtNewGmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewGmailActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioBtnOther);
        radioBtnOther.setForeground(new java.awt.Color(255, 255, 255));
        radioBtnOther.setText("Other");
        radioBtnOther.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnOtherActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Phone no(0000-0000000):");

        buttonGroup1.add(radioBtnMale);
        radioBtnMale.setForeground(new java.awt.Color(255, 255, 255));
        radioBtnMale.setText("Male");
        radioBtnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnMaleActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Height:");

        buttonGroup1.add(radioBtnFemale);
        radioBtnFemale.setForeground(new java.awt.Color(255, 255, 255));
        radioBtnFemale.setText("Female");
        radioBtnFemale.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        radioBtnFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnFemaleActionPerformed(evt);
            }
        });

        txtNewHeight.setBackground(new java.awt.Color(35, 43, 42));
        txtNewHeight.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtNewHeight.setForeground(new java.awt.Color(255, 255, 255));
        txtNewHeight.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtNewHeight.setMargin(new java.awt.Insets(2, 1, 2, 1));
        txtNewHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewHeightActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Weight:");

        txtNewWeight.setBackground(new java.awt.Color(35, 43, 42));
        txtNewWeight.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtNewWeight.setForeground(new java.awt.Color(255, 255, 255));
        txtNewWeight.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtNewWeight.setMargin(new java.awt.Insets(2, 1, 2, 1));
        txtNewWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewWeightActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Fitness goal:");

        buttonGroup2.add(radioBtnWeightLoss);
        radioBtnWeightLoss.setForeground(new java.awt.Color(255, 255, 255));
        radioBtnWeightLoss.setText("Weight loss");
        radioBtnWeightLoss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnWeightLossActionPerformed(evt);
            }
        });

        buttonGroup2.add(radioBtnMuscleGain);
        radioBtnMuscleGain.setForeground(new java.awt.Color(255, 255, 255));
        radioBtnMuscleGain.setText("Muscle gain");
        radioBtnMuscleGain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnMuscleGainActionPerformed(evt);
            }
        });

        buttonGroup2.add(radioBtnShredding);
        radioBtnShredding.setForeground(new java.awt.Color(255, 255, 255));
        radioBtnShredding.setText("Shredding");
        radioBtnShredding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnShreddingActionPerformed(evt);
            }
        });

        txtNewOutStandingBalance.setBackground(new java.awt.Color(35, 43, 42));
        txtNewOutStandingBalance.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtNewOutStandingBalance.setForeground(new java.awt.Color(255, 255, 255));
        txtNewOutStandingBalance.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtNewOutStandingBalance.setMargin(new java.awt.Insets(2, 1, 2, 1));
        txtNewOutStandingBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewOutStandingBalanceActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Out standing balance:");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Credit card account holder:");

        txtNewCCAccountHolder.setBackground(new java.awt.Color(35, 43, 42));
        txtNewCCAccountHolder.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtNewCCAccountHolder.setForeground(new java.awt.Color(255, 255, 255));
        txtNewCCAccountHolder.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtNewCCAccountHolder.setMargin(new java.awt.Insets(2, 1, 2, 1));
        txtNewCCAccountHolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewCCAccountHolderActionPerformed(evt);
            }
        });

        txtNewCreditCardNumber.setBackground(new java.awt.Color(35, 43, 42));
        txtNewCreditCardNumber.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtNewCreditCardNumber.setForeground(new java.awt.Color(255, 255, 255));
        txtNewCreditCardNumber.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtNewCreditCardNumber.setMargin(new java.awt.Insets(2, 1, 2, 1));
        txtNewCreditCardNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewCreditCardNumberActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Credit card number:");

        btnSave.setBackground(new java.awt.Color(17, 122, 102));
        btnSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnBack1.setBackground(new java.awt.Color(17, 122, 102));
        btnBack1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack1.setForeground(new java.awt.Color(255, 255, 255));
        btnBack1.setText("Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Modify Member Information");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearchMember))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNewGmail, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNewName, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNewPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNewWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioBtnMale)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radioBtnFemale)
                                        .addGap(14, 14, 14)
                                        .addComponent(radioBtnOther))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNewHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radioBtnWeightLoss)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radioBtnMuscleGain)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radioBtnShredding))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel26)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtNewCreditCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel23)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtNewOutStandingBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel25)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtNewCCAccountHolder, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(102, 102, 102)
                                            .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNewAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchMember))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNewName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNewGmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNewPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNewAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioBtnMale)
                    .addComponent(radioBtnFemale)
                    .addComponent(radioBtnOther))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNewHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNewWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioBtnWeightLoss)
                    .addComponent(radioBtnMuscleGain)
                    .addComponent(radioBtnShredding))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNewOutStandingBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNewCCAccountHolder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNewCreditCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNewPhoneNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewPhoneNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewPhoneNoActionPerformed

    private void txtNewAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewAddressActionPerformed

    private void radioBtnShreddingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnShreddingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnShreddingActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
            String regId = txtRegNo.getText();
            String name = txtNewName.getText();
            String gmail = txtNewGmail.getText();
            String phoneNo = txtNewPhoneNo.getText();
            String address = txtNewAddress.getText();
            String height = txtNewHeight.getText();
            String weight = txtNewWeight.getText();
            String outStandingBalance = txtNewOutStandingBalance.getText();
            String creditCardAccountHolder = txtNewCCAccountHolder.getText();
            String creditCardNumber = txtNewCreditCardNumber.getText();
            if(!(regId.isEmpty() && name.isEmpty() &&  gmail.isEmpty() && phoneNo.isEmpty() && address.isEmpty() && 
                        height.isEmpty()&& weight.isEmpty() && outStandingBalance.isEmpty() &&
                    creditCardAccountHolder.isEmpty() && creditCardNumber.isEmpty())){
                if(!(name.isEmpty()) && member.validateName(name)){
                    member.name = name;
                    //JOptionPane.showMessageDialog(null, "New name is updated.");
                }
                if(!(gmail.isEmpty()) && member.validateGmail(gmail)){
                    member.gmail = gmail;
                    //JOptionPane.showMessageDialog(null, "New gmail is updated.");
                }
                if(!(phoneNo.isEmpty()) && member.validatePhone(phoneNo)){
                    member.phoneNum = phoneNo;
                    //JOptionPane.showMessageDialog(null, "New phone no. is updated.");
                }
                if(!address.isEmpty()){
                    member.address = address;
                    //JOptionPane.showMessageDialog(null, "New address is updated.");
                }
                if(!(height.isEmpty()) && member.validateHeight(height)){
                    member.setHeight(Double.parseDouble(height));
                    //JOptionPane.showMessageDialog(null, "New new height is updated.");
                }
                if(!(weight.isEmpty()) && member.validateWeight(weight)){
                    member.setWeight(Double.parseDouble(weight));
                    //JOptionPane.showMessageDialog(null, "New weight is updated.");
                }
                if(radioBtnFemale.isSelected() || radioBtnMale.isSelected() || radioBtnOther.isSelected()){
                   member.gender = checkGender();
                   //JOptionPane.showMessageDialog(null, "New gender is updated.");
                }
                if(radioBtnShredding.isSelected() || radioBtnWeightLoss.isSelected() || radioBtnMuscleGain.isSelected()){
                    member.setFitnessGoal(checkFitnessGoal());
                   //JOptionPane.showMessageDialog(null, "New fitness goal is updated.");
                }
                if(!(outStandingBalance.isEmpty()) && member.checkNumberIsdouble(outStandingBalance)){
                    payment.setOutstandingBalance(Double.parseDouble(outStandingBalance)); 
                    //JOptionPane.showMessageDialog(null, "New  is updated.");
                }
                if(!(creditCardAccountHolder.isEmpty()) && payment.validateName(creditCardAccountHolder)){
                    payment.setCreditCardAccountHolder(creditCardAccountHolder);
                    //JOptionPane.showMessageDialog(null, "New out standing balance is updated.");
                }
                if(!(creditCardNumber.isEmpty()) && payment.validateCreditCard(creditCardNumber)){
                    payment.setCreditCardNum(creditCardNumber);
                    //JOptionPane.showMessageDialog(null, "New credit card number is updated.");
                }
                 JOptionPane.showMessageDialog(null, "Member Data Updated.");
                gym.modifyMember(member, Integer.parseInt(regId));
                txtRegNo.setText("");
                txtNewName.setText("");
                txtNewGmail.setText("");
                txtNewPhoneNo.setText("");
                txtNewAddress.setText("");
                txtNewHeight.setText("");
                txtNewWeight.setText("");
                txtNewOutStandingBalance.setText("");
                txtNewCCAccountHolder.setText("");
                txtNewCreditCardNumber.setText("");
                txtNewName.setEditable(false);
                txtNewGmail.setEditable(false);
                txtNewPhoneNo.setEditable(false);
                txtNewAddress.setEditable(false);
                txtNewHeight.setEditable(false);
                txtNewWeight.setEditable(false);
                txtNewOutStandingBalance.setEditable(false);
                txtNewCCAccountHolder.setEditable(false);
                txtNewCreditCardNumber.setEditable(false);
            } else{
                 btnSearchMemberActionPerformed(evt);
            }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnSearchMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchMemberActionPerformed

            String regId = txtRegNo.getText();
            if(!regId.isEmpty()){
                if(gym.checkNumberIsInt(regId)){
                    if(gym.memberExist(Integer.parseInt(regId))){
                        txtNewName.setEditable(true);
                        txtNewGmail.setEditable(true);
                        txtNewPhoneNo.setEditable(true);
                        txtNewAddress.setEditable(true);
                        txtNewHeight.setEditable(true);
                        txtNewWeight.setEditable(true);
                        txtNewOutStandingBalance.setEditable(true);
                        txtNewCCAccountHolder.setEditable(true);
                        txtNewCreditCardNumber.setEditable(true);
                        JOptionPane.showMessageDialog(null, "Reg no. found, fields are open now.");
                        member = gym.memberData(Integer.parseInt(regId));
                    } else{
                        JOptionPane.showMessageDialog(null, "No member found having Reg id " + regId + ",enter correct reg id.");
                        txtRegNo.setText("");
                    }
                } else{
                    JOptionPane.showMessageDialog(null, "Reg Id should be in number, enter again.");
                }
            } else{
                JOptionPane.showMessageDialog(null, "Enter the reg Id first.");
            }
    }//GEN-LAST:event_btnSearchMemberActionPerformed

    private void radioBtnOtherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnOtherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnOtherActionPerformed

    private void radioBtnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnMaleActionPerformed

    private void radioBtnFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnFemaleActionPerformed

    private void txtNewHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewHeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewHeightActionPerformed

    private void txtNewOutStandingBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewOutStandingBalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewOutStandingBalanceActionPerformed

    private void txtNewWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewWeightActionPerformed

    private void txtRegNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegNoActionPerformed
       
    }//GEN-LAST:event_txtRegNoActionPerformed

    private void txtNewCCAccountHolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewCCAccountHolderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewCCAccountHolderActionPerformed

    private void txtNewCreditCardNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewCreditCardNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewCreditCardNumberActionPerformed

    private void radioBtnWeightLossActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnWeightLossActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnWeightLossActionPerformed

    private void txtNewNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewNameActionPerformed

    private void radioBtnMuscleGainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnMuscleGainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnMuscleGainActionPerformed

    private void txtNewGmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewGmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewGmailActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        dispose();
        JFrameMemberMenu memberMenu = new JFrameMemberMenu();
        memberMenu.setVisible(true);
    }//GEN-LAST:event_btnBack1ActionPerformed
    public String checkGender(){
        if(radioBtnMale.isSelected()){
            return "Male";
        } else if(radioBtnFemale.isSelected()){
            return "Female";
        }
        return "Other";
    }
    public String checkFitnessGoal(){
        if(radioBtnMuscleGain.isSelected()){
            return "Muscle gain";
        } else if(radioBtnShredding.isSelected()){
            return "Shredding";
        }
        return "Weight loss";
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameModifyMember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearchMember;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton radioBtnFemale;
    private javax.swing.JRadioButton radioBtnMale;
    private javax.swing.JRadioButton radioBtnMuscleGain;
    private javax.swing.JRadioButton radioBtnOther;
    private javax.swing.JRadioButton radioBtnShredding;
    private javax.swing.JRadioButton radioBtnWeightLoss;
    private javax.swing.JTextField txtNewAddress;
    private javax.swing.JTextField txtNewCCAccountHolder;
    private javax.swing.JTextField txtNewCreditCardNumber;
    private javax.swing.JTextField txtNewGmail;
    private javax.swing.JTextField txtNewHeight;
    private javax.swing.JTextField txtNewName;
    private javax.swing.JTextField txtNewOutStandingBalance;
    private javax.swing.JTextField txtNewPhoneNo;
    private javax.swing.JTextField txtNewWeight;
    private javax.swing.JTextField txtRegNo;
    // End of variables declaration//GEN-END:variables
}
