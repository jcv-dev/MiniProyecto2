

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Eliminar extends javax.swing.JPanel {


    public Eliminar(ArrayList<Dulce> listaDulces) {
        this.listaDulces = listaDulces;
        initComponents();
        listarDulces();
    }

    public ArrayList<Dulce> getListaDulces(){
        return listaDulces;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblEliminar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        araTexto = new javax.swing.JTextArea();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblEliminar.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        lblEliminar.setText("ELIMINAR");

        araTexto.setColumns(20);
        araTexto.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        araTexto.setRows(5);
        jScrollPane1.setViewportView(araTexto);

        lblCodigo.setText("Ingrese el codigo del producto que desea eliminar:");

        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(lblEliminar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addComponent(lblCodigo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblEliminar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(35, Short.MAX_VALUE))
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
        byte codigo = Byte.parseByte(txtCodigo.getText());
        int index = codigo -1;
        
        if(codigos.contains(codigo)){
            listaDulces.remove(index);
            JOptionPane.showMessageDialog(jPanel1, "Producto eliminado satisfactoriamente.");
            araTexto.setText("");
            listarDulces();
        }else{
            JOptionPane.showMessageDialog(jPanel1, "El codigo ingresado no existe.");  
            return;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblEliminar;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}
