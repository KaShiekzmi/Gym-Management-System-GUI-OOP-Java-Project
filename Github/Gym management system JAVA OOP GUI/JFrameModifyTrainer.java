package project_oop;
import javax.swing.*;
public class JFrameModifyTrainer extends javax.swing.JFrame {
    Trainer trainer = new Trainer();
    Gym gym = new Gym();
    public JFrameModifyTrainer() {
        initComponents();
        txtNewName.setEditable(false);
        txtNewGmail.setEditable(false);
        txtNewPhoneNo.setEditable(false);
        txtNewAddress.setEditable(false);
        txtNewHourlyRate1.setEditable(false);
        txtNewWeeklyWorkingHour.setEditable(false);
        txtNewSpecialization.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel21 = new javax.swing.JLabel();
        txtSpecialization = new javax.swing.JTextField();
        txtHourlyRate = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtWeeklyWorkingHour = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        radioBtnBeginner = new javax.swing.JRadioButton();
        radioBtnIntermediate = new javax.swing.JRadioButton();
        radioBtnAdvance = new javax.swing.JRadioButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        txtNewHourlyRate = new javax.swing.JPanel();
        txtRegNo = new javax.swing.JTextField();
        txtNewPhoneNo = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtNewAddress = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNewName = new javax.swing.JTextField();
        btnSearchTrainer = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtNewGmail = new javax.swing.JTextField();
        radioBtnOther = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        radioBtnMale = new javax.swing.JRadioButton();
        radioBtnFemale = new javax.swing.JRadioButton();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtNewWeeklyWorkingHour = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        radioBtnBeginner1 = new javax.swing.JRadioButton();
        radioBtnIntermediate1 = new javax.swing.JRadioButton();
        jLabel29 = new javax.swing.JLabel();
        radioBtnAdvance1 = new javax.swing.JRadioButton();
        txtNewHourlyRate1 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtNewSpecialization = new javax.swing.JTextField();

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Specialization:");

        txtSpecialization.setBackground(new java.awt.Color(35, 43, 42));
        txtSpecialization.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSpecialization.setForeground(new java.awt.Color(255, 255, 255));
        txtSpecialization.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtSpecialization.setMargin(new java.awt.Insets(2, 1, 2, 1));
        txtSpecialization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSpecializationActionPerformed(evt);
            }
        });

        txtHourlyRate.setBackground(new java.awt.Color(35, 43, 42));
        txtHourlyRate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtHourlyRate.setForeground(new java.awt.Color(255, 255, 255));
        txtHourlyRate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtHourlyRate.setMargin(new java.awt.Insets(2, 1, 2, 1));
        txtHourlyRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHourlyRateActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Hourly rate:");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Weekly working hour:");

        txtWeeklyWorkingHour.setBackground(new java.awt.Color(35, 43, 42));
        txtWeeklyWorkingHour.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtWeeklyWorkingHour.setForeground(new java.awt.Color(255, 255, 255));
        txtWeeklyWorkingHour.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtWeeklyWorkingHour.setMargin(new java.awt.Insets(2, 1, 2, 1));
        txtWeeklyWorkingHour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWeeklyWorkingHourActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Experience level:");

        radioBtnBeginner.setForeground(new java.awt.Color(255, 255, 255));
        radioBtnBeginner.setText("Beginner");
        radioBtnBeginner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnBeginnerActionPerformed(evt);
            }
        });

        radioBtnIntermediate.setForeground(new java.awt.Color(255, 255, 255));
        radioBtnIntermediate.setText("Intermediate");
        radioBtnIntermediate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnIntermediateActionPerformed(evt);
            }
        });

        radioBtnAdvance.setForeground(new java.awt.Color(255, 255, 255));
        radioBtnAdvance.setText("Advance");
        radioBtnAdvance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnAdvanceActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNewHourlyRate.setBackground(new java.awt.Color(35, 43, 42));

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

        btnSearchTrainer.setBackground(new java.awt.Color(17, 122, 102));
        btnSearchTrainer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSearchTrainer.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchTrainer.setText("SEARCH TRAINER");
        btnSearchTrainer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchTrainerActionPerformed(evt);
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

        buttonGroup1.add(radioBtnFemale);
        radioBtnFemale.setForeground(new java.awt.Color(255, 255, 255));
        radioBtnFemale.setText("Female");
        radioBtnFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnFemaleActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(17, 122, 102));
        btnSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(17, 122, 102));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Modify Trainer Information");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Experience level:");

        txtNewWeeklyWorkingHour.setBackground(new java.awt.Color(35, 43, 42));
        txtNewWeeklyWorkingHour.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNewWeeklyWorkingHour.setForeground(new java.awt.Color(255, 255, 255));
        txtNewWeeklyWorkingHour.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtNewWeeklyWorkingHour.setMargin(new java.awt.Insets(2, 1, 2, 1));
        txtNewWeeklyWorkingHour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewWeeklyWorkingHourActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Hourly rate:");

        buttonGroup2.add(radioBtnBeginner1);
        radioBtnBeginner1.setForeground(new java.awt.Color(255, 255, 255));
        radioBtnBeginner1.setText("Beginner");
        radioBtnBeginner1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnBeginner1ActionPerformed(evt);
            }
        });

        buttonGroup2.add(radioBtnIntermediate1);
        radioBtnIntermediate1.setForeground(new java.awt.Color(255, 255, 255));
        radioBtnIntermediate1.setText("Intermediate");
        radioBtnIntermediate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnIntermediate1ActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Weekly working hour:");

        buttonGroup2.add(radioBtnAdvance1);
        radioBtnAdvance1.setForeground(new java.awt.Color(255, 255, 255));
        radioBtnAdvance1.setText("Advance");
        radioBtnAdvance1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnAdvance1ActionPerformed(evt);
            }
        });

        txtNewHourlyRate1.setBackground(new java.awt.Color(35, 43, 42));
        txtNewHourlyRate1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNewHourlyRate1.setForeground(new java.awt.Color(255, 255, 255));
        txtNewHourlyRate1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtNewHourlyRate1.setMargin(new java.awt.Insets(2, 1, 2, 1));
        txtNewHourlyRate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewHourlyRate1ActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Specialization:");

        txtNewSpecialization.setBackground(new java.awt.Color(35, 43, 42));
        txtNewSpecialization.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNewSpecialization.setForeground(new java.awt.Color(255, 255, 255));
        txtNewSpecialization.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtNewSpecialization.setMargin(new java.awt.Insets(2, 1, 2, 1));
        txtNewSpecialization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewSpecializationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout txtNewHourlyRateLayout = new javax.swing.GroupLayout(txtNewHourlyRate);
        txtNewHourlyRate.setLayout(txtNewHourlyRateLayout);
        txtNewHourlyRateLayout.setHorizontalGroup(
            txtNewHourlyRateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtNewHourlyRateLayout.createSequentialGroup()
                .addGroup(txtNewHourlyRateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtNewHourlyRateLayout.createSequentialGroup()
                        .addGroup(txtNewHourlyRateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(txtNewHourlyRateLayout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearchTrainer))
                            .addGroup(txtNewHourlyRateLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1))
                            .addGroup(txtNewHourlyRateLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(txtNewHourlyRateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(txtNewHourlyRateLayout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNewGmail, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(txtNewHourlyRateLayout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNewName, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(txtNewHourlyRateLayout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNewPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(txtNewHourlyRateLayout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioBtnMale)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radioBtnFemale)
                                        .addGap(14, 14, 14)
                                        .addComponent(radioBtnOther))
                                    .addGroup(txtNewHourlyRateLayout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNewAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(txtNewHourlyRateLayout.createSequentialGroup()
                                        .addComponent(jLabel29)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNewWeeklyWorkingHour, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(txtNewHourlyRateLayout.createSequentialGroup()
                                        .addComponent(jLabel28)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNewHourlyRate1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(txtNewHourlyRateLayout.createSequentialGroup()
                                        .addComponent(jLabel30)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radioBtnBeginner1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radioBtnIntermediate1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radioBtnAdvance1))
                                    .addGroup(txtNewHourlyRateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(txtNewHourlyRateLayout.createSequentialGroup()
                                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(txtNewHourlyRateLayout.createSequentialGroup()
                                            .addComponent(jLabel27)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtNewSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        txtNewHourlyRateLayout.setVerticalGroup(
            txtNewHourlyRateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtNewHourlyRateLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(txtNewHourlyRateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchTrainer))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(txtNewHourlyRateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNewName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txtNewHourlyRateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNewGmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txtNewHourlyRateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNewPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txtNewHourlyRateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNewAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(txtNewHourlyRateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioBtnMale)
                    .addComponent(radioBtnFemale)
                    .addComponent(radioBtnOther))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txtNewHourlyRateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNewSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(txtNewHourlyRateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNewHourlyRate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txtNewHourlyRateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNewWeeklyWorkingHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txtNewHourlyRateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioBtnBeginner1)
                    .addComponent(radioBtnIntermediate1)
                    .addComponent(radioBtnAdvance1))
                .addGap(36, 36, 36)
                .addGroup(txtNewHourlyRateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtNewHourlyRate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txtNewHourlyRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRegNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegNoActionPerformed

    }//GEN-LAST:event_txtRegNoActionPerformed

    private void txtNewPhoneNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewPhoneNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewPhoneNoActionPerformed

    private void txtNewAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewAddressActionPerformed

    private void txtNewNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewNameActionPerformed

    private void btnSearchTrainerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchTrainerActionPerformed
        String regId = txtRegNo.getText();
        if(!regId.isEmpty()){
            if(gym.checkNumberIsInt(regId)){
                if(gym.trainerExist(Integer.parseInt(regId))){
                    txtNewName.setEditable(true);
                    txtNewGmail.setEditable(true);
                    txtNewPhoneNo.setEditable(true);
                    txtNewAddress.setEditable(true);
                    txtNewHourlyRate1.setEditable(true);
                    txtNewWeeklyWorkingHour.setEditable(true);
                    txtNewSpecialization.setEditable(true);
                    JOptionPane.showMessageDialog(null, "Reg no. found, fields are open now.");
                    trainer = gym.trainerData(Integer.parseInt(regId));
                } else{
                    JOptionPane.showMessageDialog(null, "No trainer found having Reg id " + regId + ",enter correct reg id.");
                    txtRegNo.setText("");
                }
            } else{
                JOptionPane.showMessageDialog(null, "Reg Id should be in number, enter again.");
            }
        } else{
            JOptionPane.showMessageDialog(null, "Enter the reg Id first.");
        }

    }//GEN-LAST:event_btnSearchTrainerActionPerformed

    private void txtNewGmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewGmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewGmailActionPerformed

    private void radioBtnOtherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnOtherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnOtherActionPerformed

    private void radioBtnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnMaleActionPerformed

    private void radioBtnFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnFemaleActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        String regId = txtRegNo.getText();
        String name = txtNewName.getText();
        String gmail = txtNewGmail.getText();
        String phoneNo = txtNewPhoneNo.getText();
        String address = txtNewAddress.getText();
        String hourlyRate = txtNewHourlyRate1.getText();
        String weeklyWorkingHour = txtNewWeeklyWorkingHour.getText();
        String specialization = txtNewSpecialization.getText();
        if(!(regId.isEmpty() && name.isEmpty() &&  gmail.isEmpty() && phoneNo.isEmpty() && address.isEmpty() && 
                        specialization.isEmpty()&& hourlyRate.isEmpty() && weeklyWorkingHour.isEmpty())){
            if(!(name.isEmpty()) && trainer.validateName(name)){
                trainer.name = name;
                //JOptionPane.showMessageDialog(null, "New name is updated.");
            }
            if(!(gmail.isEmpty()) && trainer.validateGmail(gmail)){
                trainer.gmail = gmail;
                //JOptionPane.showMessageDialog(null, "New gmail is updated.");
            }
            if(!(phoneNo.isEmpty()) && trainer.validatePhone(phoneNo)){
                trainer.phoneNum = phoneNo;
                //JOptionPane.showMessageDialog(null, "New phone no. is updated.");
            }
            if(!address.isEmpty()){
                trainer.address = address;
                //JOptionPane.showMessageDialog(null, "New address is updated.");
            }
            if(!(weeklyWorkingHour.isEmpty()) && trainer.validateWeeklyWorkingHours(weeklyWorkingHour)){
                trainer.setWeeklyWorkingHours(Double.parseDouble(weeklyWorkingHour));
                //JOptionPane.showMessageDialog(null, "New weekly working hour is updated.");
            }
            if(!(hourlyRate.isEmpty()) && trainer.validateHourlyRate(hourlyRate)){
                trainer.setHourlyRate(Double.parseDouble(hourlyRate));
                //JOptionPane.showMessageDialog(null, "New hourly rate is updated.");
            }
            if(radioBtnFemale.isSelected() || radioBtnMale.isSelected() || radioBtnOther.isSelected()){
                trainer.gender = checkGender();
                //JOptionPane.showMessageDialog(null, "New gender is updated.");
            }
            if(radioBtnAdvance.isSelected() || radioBtnBeginner.isSelected() || radioBtnIntermediate.isSelected()){
                trainer.setExperienceLevel(checkExpereinceLvl());
            }
            if(!(specialization.isEmpty())){
                trainer.setSpecialization(specialization);
            }
            JOptionPane.showMessageDialog(null, "Trainer Data Updated.");
            gym.modifyTrainer(trainer, Integer.parseInt(regId));
                txtRegNo.setText("");
                txtNewName.setText("");
                txtNewGmail.setText("");
                txtNewPhoneNo.setText("");
                txtNewAddress.setText("");
                txtNewHourlyRate1.setText("");
                txtNewWeeklyWorkingHour.setText("");
                txtNewSpecialization.setText("");
                txtNewName.setEditable(false);
                txtNewGmail.setEditable(false);
                txtNewPhoneNo.setEditable(false);
                txtNewAddress.setEditable(false);
                txtNewHourlyRate1.setEditable(false);
                txtNewWeeklyWorkingHour.setEditable(false);
                txtNewSpecialization.setEditable(false);
        }else{
            btnSearchTrainerActionPerformed(evt);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        dispose();
        JFrameTrainerMenu trainerMenu = new JFrameTrainerMenu();
        trainerMenu.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtSpecializationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSpecializationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSpecializationActionPerformed

    private void txtHourlyRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHourlyRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHourlyRateActionPerformed

    private void txtWeeklyWorkingHourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWeeklyWorkingHourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWeeklyWorkingHourActionPerformed

    private void radioBtnBeginnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnBeginnerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnBeginnerActionPerformed

    private void radioBtnIntermediateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnIntermediateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnIntermediateActionPerformed

    private void radioBtnAdvanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnAdvanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnAdvanceActionPerformed

    private void txtNewSpecializationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewSpecializationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewSpecializationActionPerformed

    private void txtNewHourlyRate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewHourlyRate1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewHourlyRate1ActionPerformed

    private void txtNewWeeklyWorkingHourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewWeeklyWorkingHourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewWeeklyWorkingHourActionPerformed

    private void radioBtnBeginner1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnBeginner1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnBeginner1ActionPerformed

    private void radioBtnIntermediate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnIntermediate1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnIntermediate1ActionPerformed

    private void radioBtnAdvance1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnAdvance1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnAdvance1ActionPerformed
    public String checkGender(){
        if(radioBtnMale.isSelected()){
            return "Male";
        } else if(radioBtnFemale.isSelected()){
            return "Female";
        }
        return "Other";
    }
    public String checkExpereinceLvl(){
        if(radioBtnBeginner.isSelected()){
            return "Beginner";
        } else if(radioBtnAdvance.isSelected()){
            return "Advance";
        }
        return "Intermediate";
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameModifyTrainer().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearchTrainer;
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
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JRadioButton radioBtnAdvance;
    private javax.swing.JRadioButton radioBtnAdvance1;
    private javax.swing.JRadioButton radioBtnBeginner;
    private javax.swing.JRadioButton radioBtnBeginner1;
    private javax.swing.JRadioButton radioBtnFemale;
    private javax.swing.JRadioButton radioBtnIntermediate;
    private javax.swing.JRadioButton radioBtnIntermediate1;
    private javax.swing.JRadioButton radioBtnMale;
    private javax.swing.JRadioButton radioBtnOther;
    private javax.swing.JTextField txtHourlyRate;
    private javax.swing.JTextField txtNewAddress;
    private javax.swing.JTextField txtNewGmail;
    private javax.swing.JPanel txtNewHourlyRate;
    private javax.swing.JTextField txtNewHourlyRate1;
    private javax.swing.JTextField txtNewName;
    private javax.swing.JTextField txtNewPhoneNo;
    private javax.swing.JTextField txtNewSpecialization;
    private javax.swing.JTextField txtNewWeeklyWorkingHour;
    private javax.swing.JTextField txtRegNo;
    private javax.swing.JTextField txtSpecialization;
    private javax.swing.JTextField txtWeeklyWorkingHour;
    // End of variables declaration//GEN-END:variables
}
