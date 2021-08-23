import javax.swing.JOptionPane;

public class CassinoFloquinho extends javax.swing.JFrame {
    String nome;
    float valor_entrada = 0;
    float troco = 0;
    int petisco = 0;
    int quantidade_10_petiscos = 0;
    int quantidade_100_petiscos = 0;
    int quantidade_500_petiscos = 0;
    
    public CassinoFloquinho() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campo_nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campo_valor_entrada = new javax.swing.JTextField();
        label_pikachu = new javax.swing.JLabel();
        botao_10_petiscos = new javax.swing.JButton();
        botao_100_petiscos = new javax.swing.JButton();
        botao_500_petiscos = new javax.swing.JButton();
        jogar = new javax.swing.JButton();
        label_troco = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/floquinho.jpeg"))); // NOI18N
        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 500));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cassino Floquinho");

        jLabel2.setText("Nome:");

        jLabel3.setText("Valor de entrada:");

        label_pikachu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_pikachu.setText("Petiscos:");

        botao_10_petiscos.setText("10 Petiscos");
        botao_10_petiscos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_10_petiscosActionPerformed(evt);
            }
        });

        botao_100_petiscos.setText("100 Petiscos");
        botao_100_petiscos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_100_petiscosActionPerformed(evt);
            }
        });

        botao_500_petiscos.setText("500 Petiscos");
        botao_500_petiscos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_500_petiscosActionPerformed(evt);
            }
        });

        jogar.setText("JOGAR");
        jogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jogarActionPerformed(evt);
            }
        });

        label_troco.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_troco.setText("Troco:");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/floquinho.jpeg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(botao_10_petiscos)
                        .addGap(40, 40, 40)
                        .addComponent(botao_100_petiscos)
                        .addGap(40, 40, 40)
                        .addComponent(botao_500_petiscos))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campo_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_valor_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(label_pikachu)
                        .addGap(78, 78, 78)
                        .addComponent(label_troco))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jogar)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campo_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_valor_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(40, 40, 40)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_500_petiscos, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_100_petiscos, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_10_petiscos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_pikachu)
                    .addComponent(label_troco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jogar)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botao_100_petiscosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_100_petiscosActionPerformed
        comprarFichas(100);
        quantidade_100_petiscos = quantidade_100_petiscos + 1;
    }//GEN-LAST:event_botao_100_petiscosActionPerformed

    private void botao_10_petiscosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_10_petiscosActionPerformed
        comprarFichas(10);
        quantidade_10_petiscos = quantidade_10_petiscos + 1;
    }//GEN-LAST:event_botao_10_petiscosActionPerformed

    private void botao_500_petiscosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_500_petiscosActionPerformed
        comprarFichas(500);
        quantidade_500_petiscos = quantidade_500_petiscos + 1;
    }//GEN-LAST:event_botao_500_petiscosActionPerformed

    private void jogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jogarActionPerformed
        Menu_Petiscos menu = new Menu_Petiscos();
        menu.setVisible(true);
    }//GEN-LAST:event_jogarActionPerformed

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
            java.util.logging.Logger.getLogger(CassinoFloquinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CassinoFloquinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CassinoFloquinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CassinoFloquinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CassinoFloquinho().setVisible(true);
            }
        });
    }
    public void comprarFichas(int valor_ficha){
        nome = campo_nome.getText();
        valor_entrada = Float.parseFloat(campo_valor_entrada.getText());
        petisco = petisco + valor_ficha;
        troco = valor_entrada - petisco;
        label_pikachu.setText("Petisco: " + petisco);
        label_troco.setText("Troco: " + troco);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_100_petiscos;
    private javax.swing.JButton botao_10_petiscos;
    private javax.swing.JButton botao_500_petiscos;
    private javax.swing.JTextField campo_nome;
    private javax.swing.JTextField campo_valor_entrada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jogar;
    private javax.swing.JLabel label_pikachu;
    private javax.swing.JLabel label_troco;
    // End of variables declaration//GEN-END:variables
}
