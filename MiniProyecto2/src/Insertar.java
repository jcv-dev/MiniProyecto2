

import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Insertar extends javax.swing.JPanel {
    public Insertar(ArrayList<Dulce> listaDulces) {
        this.listaDulces = listaDulces;
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        grpTipoDulce = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bgInsertar = new javax.swing.JPanel();
        lblInsertar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblTipo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        rdoDulce = new javax.swing.JRadioButton();
        rdoAcido = new javax.swing.JRadioButton();
        rdoSinAzucar = new javax.swing.JRadioButton();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblEtiquetas = new javax.swing.JLabel();
        chkExcesoSodio = new javax.swing.JCheckBox();
        chkExcesoAzucar = new javax.swing.JCheckBox();
        chkExcesoSaturadas = new javax.swing.JCheckBox();
        chkExcesoTrans = new javax.swing.JCheckBox();
        chkEdulcorantes = new javax.swing.JCheckBox();
        separador = new javax.swing.JSeparator();
        lblMarca = new javax.swing.JLabel();
        cboMarca = new javax.swing.JComboBox<>();
        lblPorcentajeGrasa = new javax.swing.JLabel();
        spnGrasa = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        bgInsertar.setBackground(new java.awt.Color(255, 255, 255));

        lblInsertar.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        lblInsertar.setText("INSERTAR");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblTipo.setText("Tipo:");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        grpTipoDulce.add(rdoDulce);
        rdoDulce.setText("Dulce");
        rdoDulce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoDulceActionPerformed(evt);
            }
        });

        grpTipoDulce.add(rdoAcido);
        rdoAcido.setText("Ácido");

        grpTipoDulce.add(rdoSinAzucar);
        rdoSinAzucar.setText("Sin Azucar");
        rdoSinAzucar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoSinAzucarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdoDulce)
                    .addComponent(rdoAcido)
                    .addComponent(rdoSinAzucar))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdoDulce)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoAcido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoSinAzucar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblNombre.setText("Nombre del dulce:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        lblEtiquetas.setText("Etiquetas frontales:");

        chkExcesoSodio.setText("Exceso en Sodio");

        chkExcesoAzucar.setText("Exceso en Azúcares");

        chkExcesoSaturadas.setText("Exceso en Grasas Saturadas");

        chkExcesoTrans.setText("Exceso en Grasas Trans");

        chkEdulcorantes.setText("Contiene Edulcorantes");

        separador.setBackground(new java.awt.Color(0, 153, 204));
        separador.setForeground(new java.awt.Color(0, 153, 204));
        separador.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblMarca.setText("Marca:");

        cboMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Colombina", "Nestlé", "FritoLay", "Postobon" }));

        lblPorcentajeGrasa.setText("Porcentaje de grasa:");

        spnGrasa.setModel(new javax.swing.SpinnerNumberModel(Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)100), Byte.valueOf((byte)1)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre)
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkEdulcorantes)
                            .addComponent(lblEtiquetas)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(chkExcesoSodio)
                            .addComponent(chkExcesoAzucar)
                            .addComponent(chkExcesoSaturadas)
                            .addComponent(chkExcesoTrans))
                        .addGap(41, 41, 41)
                        .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblMarca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboMarca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(34, 34, 34))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblPorcentajeGrasa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spnGrasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(40, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblEtiquetas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkExcesoSodio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkExcesoAzucar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkExcesoSaturadas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkExcesoTrans)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkEdulcorantes)
                        .addContainerGap(15, Short.MAX_VALUE))
                    .addComponent(separador)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMarca)
                            .addComponent(cboMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPorcentajeGrasa)
                            .addComponent(spnGrasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jButton1.setText("Insertar Dulce");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgInsertarLayout = new javax.swing.GroupLayout(bgInsertar);
        bgInsertar.setLayout(bgInsertarLayout);
        bgInsertarLayout.setHorizontalGroup(
            bgInsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgInsertarLayout.createSequentialGroup()
                .addGroup(bgInsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(bgInsertarLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(lblInsertar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(bgInsertarLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgInsertarLayout.setVerticalGroup(
            bgInsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgInsertarLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblInsertar)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rdoDulceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoDulceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoDulceActionPerformed

    private void rdoSinAzucarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoSinAzucarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoSinAzucarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        // Validacion de campo Nombre y posterior asignacion
        if(txtNombre.getText().length() == 0){
            JOptionPane.showMessageDialog(jPanel1, "No se ha ingresado un nombre de dulce.");
            return;
        }
        String nombreDulce = txtNombre.getText();

        
        
        // Asignacion de tipo de dulce usando el button group. Si no hay ninguno, se termina la ejecucion.
        TipoDulce tipoDulce;
        if(rdoDulce.isSelected()){
            tipoDulce = TipoDulce.DULCE;
        }else if(rdoAcido.isSelected()){
            tipoDulce = TipoDulce.ACIDO;
        }else if(rdoSinAzucar.isSelected()){
            tipoDulce = TipoDulce.SIN_AZUCAR;
        }else{
            JOptionPane.showMessageDialog(jPanel1, "No se ha ingresado un tipo de dulce.");
            return;
        }
        
        boolean excesoSodio = false, excesoAzucar = false, excesoSaturadas = false, excesoTrans = false, contieneEdulcorantes = false;
        
        if(chkExcesoSodio.isSelected()){
            excesoSodio = true;
        }
        if(chkExcesoAzucar.isSelected()){
            excesoAzucar = true;
        }
        if(chkExcesoSaturadas.isSelected()){
            excesoSaturadas = true;
        }
        if(chkExcesoTrans.isSelected()){
            excesoTrans = true;
        }
        if(chkEdulcorantes.isSelected()){
            contieneEdulcorantes = true;
        }
        
        String marcaSeleccionada = cboMarca.getItemAt(cboMarca.getSelectedIndex());
        Marca marca = Marca.COLOMBINA;
        
        switch (marcaSeleccionada.toUpperCase()) {
            case "COLOMBINA":
                marca = Marca.COLOMBINA;
                break;
            case "NESTLÉ":
                marca = Marca.NESTLE;
                break;
            case "FRITOLAY":
                marca = Marca.FRITOLAY;
                break;
            case "POSTOBON":
                marca = Marca.POSTOBON;
                break;
            default:
                break;
        }
        
        byte porcentajeGrasa = (Byte)spnGrasa.getValue();
        
        Dulce dulce = new Dulce(nombreDulce, tipoDulce, porcentajeGrasa, excesoSodio, excesoAzucar, excesoSaturadas, excesoTrans, contieneEdulcorantes, marca);
        listaDulces.add(dulce);
        
        JOptionPane.showMessageDialog(jPanel1, "Dulce agregado satisfactoriamente.");
    }//GEN-LAST:event_jButton1ActionPerformed

    public ArrayList<Dulce> getListaDulces(){
        return listaDulces;
    }
    
    ArrayList<Dulce> listaDulces = new ArrayList<Dulce>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgInsertar;
    private javax.swing.JComboBox<String> cboMarca;
    private javax.swing.JCheckBox chkEdulcorantes;
    private javax.swing.JCheckBox chkExcesoAzucar;
    private javax.swing.JCheckBox chkExcesoSaturadas;
    private javax.swing.JCheckBox chkExcesoSodio;
    private javax.swing.JCheckBox chkExcesoTrans;
    private javax.swing.ButtonGroup grpTipoDulce;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblEtiquetas;
    private javax.swing.JLabel lblInsertar;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPorcentajeGrasa;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JRadioButton rdoAcido;
    private javax.swing.JRadioButton rdoDulce;
    private javax.swing.JRadioButton rdoSinAzucar;
    private javax.swing.JSeparator separador;
    private javax.swing.JSpinner spnGrasa;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
