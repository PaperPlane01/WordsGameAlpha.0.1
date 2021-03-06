/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainapplication;

import gameobjects.Vocabulary;
import gameobjects.Word;
import gameprocess.GameSession;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Администратор
 */
public class StartingForm extends javax.swing.JFrame {

    public GameSession currentSession;

    /**
     * Creates new form MainForm
     */
    public StartingForm() {
        this.currentSession = Runner.currentSession;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenu1 = new javax.swing.JMenu();
        selectFileButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        humanSelectedRadioButton = new javax.swing.JRadioButton();
        computerSelectedRadioButton = new javax.swing.JRadioButton();
        startButton = new javax.swing.JButton();
        pathToFileField = new javax.swing.JTextField();
        useDefaultVocabularyRadioButton = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        playerNameField = new javax.swing.JTextField();
        enterNumberOfTurnsLabel = new javax.swing.JLabel();
        numberOfTurnsField = new javax.swing.JTextField();

        jMenu1.setText("About");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Words game");
        setBackground(new java.awt.Color(255, 204, 204));
        setPreferredSize(new java.awt.Dimension(276, 480));

        selectFileButton.setText("Выбрать файл");
        selectFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectFileButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Первый ход делает:");

        humanSelectedRadioButton.setText("Человек");
        humanSelectedRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                humanSelectedRadioButtonActionPerformed(evt);
            }
        });

        computerSelectedRadioButton.setText("Компьютер");
        computerSelectedRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computerSelectedRadioButtonActionPerformed(evt);
            }
        });

        startButton.setText("Начать");
        startButton.setEnabled(false);
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        useDefaultVocabularyRadioButton.setText("<html><b>Использовать словарь по умолчанию</b></html>");
        useDefaultVocabularyRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useDefaultVocabularyRadioButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Введите ваше имя:");

        enterNumberOfTurnsLabel.setText("<html>Введите количество ходов (10 по умолчанию):</html>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(computerSelectedRadioButton, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(startButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(humanSelectedRadioButton)
                    .addComponent(numberOfTurnsField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterNumberOfTurnsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pathToFileField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(selectFileButton, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(playerNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(useDefaultVocabularyRadioButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addComponent(playerNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(useDefaultVocabularyRadioButton)
                .addGap(20, 20, 20)
                .addComponent(pathToFileField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(selectFileButton)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(humanSelectedRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(computerSelectedRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enterNumberOfTurnsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(numberOfTurnsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(startButton)
                .addGap(65, 65, 65))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
/**
     * Allows user to select vocabulary file manually.
     *
     * @param evt
     */
    private void selectFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectFileButtonActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File vocabularyAsFile = chooser.getSelectedFile();
        String filePath = vocabularyAsFile.getAbsolutePath();
        try {
            Vocabulary vocabulary = Vocabulary.generateVocabularyFromFile(filePath);
            pathToFileField.setText(filePath);
            currentSession.setComputerVocabulary(vocabulary);
        } catch (IOException ex) {
            Logger.getLogger(StartingForm.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_selectFileButtonActionPerformed

    private void humanSelectedRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_humanSelectedRadioButtonActionPerformed
        computerSelectedRadioButton.setSelected(false);
        startButton.setEnabled(true);
    }//GEN-LAST:event_humanSelectedRadioButtonActionPerformed

    private void computerSelectedRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computerSelectedRadioButtonActionPerformed
        humanSelectedRadioButton.setSelected(false);
        startButton.setEnabled(true);
    }//GEN-LAST:event_computerSelectedRadioButtonActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed

        if (playerNameField.getText().length() != 0) {
            currentSession.getHumanPlayer().setName(playerNameField.getText());
        }

        if (computerSelectedRadioButton.isSelected()) {
            currentSession.setCurrentPlayer(1);
        }

        if (humanSelectedRadioButton.isSelected()) {
            currentSession.setCurrentPlayer(2);
        }

        if (numberOfTurnsField.getText().length() != 0) {
            try {
                Integer numberOfTurns = Integer.parseInt(numberOfTurnsField.getText());
                currentSession.setFinalNumberOfTurns(numberOfTurns);

                new GameForm().setVisible(true);
                this.setVisible(false);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Неверное количество ходов."
                        + "Количество ходов должно быть целым числом");
            }

        } else {
            currentSession.setFinalNumberOfTurns(10);
            new GameForm().setVisible(true);
            this.setVisible(false);
        }


    }//GEN-LAST:event_startButtonActionPerformed

    private void useDefaultVocabularyRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useDefaultVocabularyRadioButtonActionPerformed

        try {
            Vocabulary vocabulary = Vocabulary.generateVocabularyFromFile("vocabulary.txt");
            currentSession.setComputerVocabulary(vocabulary);
            pathToFileField.setEnabled(false);
            selectFileButton.setEnabled(false);
        } catch (IOException ex) {
            Logger.getLogger(StartingForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, new String("Ой! Кажется, что-то пошло не так. "
                    + "Пожалуйста, укажите файл словаря вручную."));
            if (useDefaultVocabularyRadioButton.isSelected()) {
                useDefaultVocabularyRadioButton.setSelected(false);
            }
        }

        if (!useDefaultVocabularyRadioButton.isSelected()) {
            if (!pathToFileField.isEnabled()) {
                pathToFileField.setEnabled(true);
            }

            if (!selectFileButton.isEnabled()) {
                selectFileButton.setEnabled(true);
            }
        }


    }//GEN-LAST:event_useDefaultVocabularyRadioButtonActionPerformed

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
            java.util.logging.Logger.getLogger(StartingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartingForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton computerSelectedRadioButton;
    private javax.swing.JLabel enterNumberOfTurnsLabel;
    private javax.swing.JRadioButton humanSelectedRadioButton;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JTextField numberOfTurnsField;
    private javax.swing.JTextField pathToFileField;
    private javax.swing.JTextField playerNameField;
    private javax.swing.JButton selectFileButton;
    private javax.swing.JButton startButton;
    private javax.swing.JRadioButton useDefaultVocabularyRadioButton;
    // End of variables declaration//GEN-END:variables
}
