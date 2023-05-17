

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Actualizar extends javax.swing.JPanel {


    public Actualizar(ArrayList<Dulce> listaDulces) {
        this.listaDulces = listaDulces;
        initComponents();
        listarDulces();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpTipo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblActualizar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        araTexto = new javax.swing.JTextArea();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        rdoDulce = new javax.swing.JRadioButton();
        rdoAcido = new javax.swing.JRadioButton();
        rdoSinAzucar = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        lblEtiquetas = new javax.swing.JLabel();
        chkSodio = new javax.swing.JCheckBox();
        chkAzucar = new javax.swing.JCheckBox();
        chkSaturadas = new javax.swing.JCheckBox();
        chkTrans = new javax.swing.JCheckBox();
        chkEdulcorantes = new javax.swing.JCheckBox();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        cboMarca = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        spnGrasa = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblActualizar.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        lblActualizar.setText("ACTUALIZAR");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        araTexto.setEditable(false);
        araTexto.setColumns(20);
        araTexto.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        araTexto.setRows(5);
        jScrollPane1.setViewportView(araTexto);

        lblCodigo.setText("Digite el codigo del producto que desea actualizar:");

        lblNombre.setText("Nuevo nombre:");

        jLabel1.setText("Nuevo tipo:");

        grpTipo.add(rdoDulce);
        rdoDulce.setText("Dulce");

        grpTipo.add(rdoAcido);
        rdoAcido.setText("Acido");

        grpTipo.add(rdoSinAzucar);
        rdoSinAzucar.setText("Sin Azucar");

        lblEtiquetas.setText("Nuevas etiquetas:");

        chkSodio.setText("Exceso en Sodio");

        chkAzucar.setText("Exceso en Azucar");

        chkSaturadas.setText("Exceso en Grasas Saturadas");

        chkTrans.setText("Exceso en Grasas Trans");

        chkEdulcorantes.setText("Contiene Edulcorantes");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel2.setText("Nueva marca:");

        cboMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Colombina", "Nestle", "FritoLay", "Postobon" }));

        jLabel3.setText("Nuevo porcentaje de grasa:");

        spnGrasa.setModel(new javax.swing.SpinnerNumberModel(Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)100), Byte.valueOf((byte)1)));

        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblActualizar)
                .addGap(142, 142, 142))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(rdoDulce)
                            .addComponent(rdoAcido)
                            .addComponent(rdoSinAzucar)
                            .addComponent(lblEtiquetas)
                            .addComponent(chkSodio)
                            .addComponent(chkAzucar)
                            .addComponent(chkSaturadas)
                            .addComponent(chkTrans)
                            .addComponent(chkEdulcorantes))
                        .addGap(28, 28, 28)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cboMarca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spnGrasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jButton1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(19, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdoDulce)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdoAcido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdoSinAzucar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEtiquetas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkSodio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkAzucar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkSaturadas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkTrans)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkEdulcorantes))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cboMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(spnGrasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(22, 22, 22))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
       // Set nombre del dulce
       byte codigo = Byte.parseByte(txtCodigo.getText());
        if(codigos.contains(codigo)){
            if(txtNombre.getText().length() == 0){
            JOptionPane.showMessageDialog(jPanel1, "No se ha ingresado un nombre de dulce.");
            return;
            }
        int index = codigo - 1;
        listaDulces.get(index).setNombreDulce(txtNombre.getText());
        
        // Set tipo de dulce
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
        listaDulces.get(codigo-1).setTipoDulce(tipoDulce);
        
        // Set etiquetas
        boolean excesoSodio = false, excesoAzucar = false, excesoSaturadas = false, excesoTrans = false, contieneEdulcorantes = false;
        
        if(chkSodio.isSelected()){
            excesoSodio = true;
        }
        if(chkAzucar.isSelected()){
            excesoAzucar = true;
        }
        if(chkSaturadas.isSelected()){
            excesoSaturadas = true;
        }
        if(chkTrans.isSelected()){
            excesoTrans = true;
        }
        if(chkEdulcorantes.isSelected()){
            contieneEdulcorantes = true;
        }
        listaDulces.get(index).setEtiquetas(excesoSodio, excesoAzucar, excesoSaturadas, excesoTrans, contieneEdulcorantes);
            
        // Set marca
        String marcaSeleccionada = cboMarca.getItemAt(cboMarca.getSelectedIndex());
        Marca marca = Marca.COLOMBINA;
        
        switch (marcaSeleccionada.toUpperCase()) {
            case "COLOMBINA":
                marca = Marca.COLOMBINA;
                break;
            case "NESTLE":
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
        listaDulces.get(index).setMarca(marca);
            
        byte porcentajeGrasa = (Byte)spnGrasa.getValue();
        listaDulces.get(index).setPorcentajeGrasa(porcentajeGrasa);
        
        JOptionPane.showMessageDialog(jPanel1, "Dulce actualizado satisfactoriamente.");
        araTexto.setText("");
        listarDulces();
        
        }else{
          JOptionPane.showMessageDialog(jPanel1, "El codigo ingresado no existe.");  
          return;
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    
    
    public ArrayList<Dulce> getListaDulces(){
        return listaDulces;
    }
    
        private void listarDulces(){
           byte contador = 1;
           
           if(listaDulces.isEmpty()){
               return;
           }
            araTexto.append("-------------------------------------------------------------\n");
            araTexto.append(String.format("| %-12s |", "CODIGO"));
            araTexto.append(String.format(" %-12s |", "NOMBRE"));
            araTexto.append(String.format(" %-12s |", "MARCA"));
            araTexto.append(String.format(" %-12s |", "TIPO"));
            araTexto.append("\n");
            araTexto.append("-------------------------------------------------------------\n");     
            
            for(Dulce dulce: (ArrayList<Dulce>)listaDulces){
                araTexto.append(String.format("| %-12s |", contador));
                araTexto.append(String.format(" %-12s |", dulce.getNombreDulce()));
                araTexto.append(String.format(" %-12s |", dulce.getMarca()));
                araTexto.append(String.format(" %-12s |\n", dulce.getTipoDulce()));
                codigos.add(contador);
                contador += 1;
            }
            araTexto.append("-------------------------------------------------------------\n");
        
    }
    ArrayList<Dulce> listaDulces = new ArrayList<Dulce>();
    ArrayList<Byte> codigos = new ArrayList<Byte>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea araTexto;
    private javax.swing.JComboBox<String> cboMarca;
    private javax.swing.JCheckBox chkAzucar;
    private javax.swing.JCheckBox chkEdulcorantes;
    private javax.swing.JCheckBox chkSaturadas;
    private javax.swing.JCheckBox chkSodio;
    private javax.swing.JCheckBox chkTrans;
    private javax.swing.ButtonGroup grpTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblActualizar;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblEtiquetas;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JRadioButton rdoAcido;
    private javax.swing.JRadioButton rdoDulce;
    private javax.swing.JRadioButton rdoSinAzucar;
    private javax.swing.JSpinner spnGrasa;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
