/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Concentracion;
import Model.EcuacionLineal;
import Model.Muestra;
import Model.Pendiente;
import View.FrameMain;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.*;
import org.jfree.chart.labels.StandardXYItemLabelGenerator;
import org.jfree.chart.labels.XYItemLabelGenerator;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.DefaultXYDataset;
import org.jfree.data.xy.XYSeries;

/**
 *
 * @author Priscilla Moraga
 */
public class ControllerMuestra {
    private Muestra muestra = new Muestra();
    private Pendiente m = new Pendiente();
    private Concentracion con = new Concentracion();
    private EcuacionLineal eL = new EcuacionLineal();

    public ControllerMuestra(FrameMain fm) {
       // fm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        fm.setTitle("Calculadora de concentración");
      // fm.lblErrorIcon.setVisible(false);
       
       
        fm.setVisible(true);
        fm.panelTabla.setVisible(false);
        fm.lblPatron4.setVisible(false);
                    fm.txtPatron7.setVisible(false);
                    fm.txtPatron8.setVisible(false);
        
        fm.cmbPatron.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                String sel = fm.cmbPatron.getSelectedItem().toString();
                if(sel.equals("3")){
                    fm.lblPatron4.setVisible(false);
                    fm.txtPatron7.setVisible(false);
                    fm.txtPatron8.setVisible(false);

                }else{
                    fm.lblPatron4.setVisible(true);
                    fm.txtPatron7.setVisible(true);
                    fm.txtPatron8.setVisible(true);
                }
            }
        
        });
        fm.btnGrafica.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me){
                JOptionPane.showMessageDialog(fm, "Universidad Nacional de Costa Rica\nSede Regional Chorotega\nCampus Liberia\n Desarrolladores: Priscilla Moraga Ibarra, Alberto Urbina Espinoza");
            }
        
        });
        
        fm.btnSalir.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me){
                fm.dispose();
            }
        
        });
        
        fm.btnLimpiar.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent me){
                limpiar(fm);
            }
        
        });
        
        
        fm.txtPatron1.addKeyListener(new KeyAdapter(){
        
            @Override
            public void keyTyped(KeyEvent e){
                char caracter = e.getKeyChar();
                String txt = fm.txtPatron1.getText();
                    if(( (caracter < '0') ||(caracter > '9')) &&(caracter != '\b') && ((caracter<'.') || caracter>'.'))
                    {
                       e.consume(); 
                    }else{
                        fm.lblErrorPatron1.setText("");
                    }

            }
        
        });
        
        fm.txtPatron2.addKeyListener(new KeyAdapter(){
        
            @Override
            public void keyTyped(KeyEvent e){
                char caracter = e.getKeyChar();
                String txt = fm.txtPatron2.getText();

                    if(( (caracter < '0') ||(caracter > '9')) &&(caracter != '\b') && ((caracter<'.') || caracter>'.'))
                    {
                       e.consume(); 
                    }else{
                        fm.lblErrorPatron2.setText("");
                    }
            }
        });
        fm.txtPatron3.addKeyListener(new KeyAdapter(){
            @Override
            public void keyTyped(KeyEvent e){
                char caracter = e.getKeyChar();
                String txt = fm.txtPatron3.getText();
                    if(( (caracter < '0') ||(caracter > '9')) &&(caracter != '\b') && ((caracter<'.') || caracter>'.'))
                    {
                       e.consume(); 
                    }else{
                        fm.lblErrorPatron3.setText("");
                    }
            }
        });
        
        fm.txtPatron4.addKeyListener(new KeyAdapter(){
        
            @Override
            public void keyTyped(KeyEvent e){
                char caracter = e.getKeyChar();
                String txt = fm.txtPatron4.getText();
                    if(( (caracter < '0') ||(caracter > '9')) &&(caracter != '\b') && ((caracter<'.') || caracter>'.'))
                    {
                       e.consume(); 
                    }else{
                        fm.lblErrorPatron4.setText("");
                    }
            }
        });
        fm.txtPatron5.addKeyListener(new KeyAdapter(){
        
            @Override
            public void keyTyped(KeyEvent e){
                char caracter = e.getKeyChar();
                String txt = fm.txtPatron5.getText();
                    if(( (caracter < '0') ||(caracter > '9')) &&(caracter != '\b') && ((caracter<'.') || caracter>'.'))
                    {
                       e.consume(); 
                    }else{
                        fm.lblErrorPatron5.setText("");
                    }
            }
        
        });
        fm.txtPatron6.addKeyListener(new KeyAdapter(){
            @Override
            public void keyTyped(KeyEvent e){
                char caracter = e.getKeyChar();
                String txt = fm.txtPatron6.getText();
                    if(( (caracter < '0') ||(caracter > '9')) &&(caracter != '\b') && ((caracter<'.') || caracter>'.'))
                    {
                       e.consume(); 
                    }else{
                        fm.lblErrorPatron6.setText("");
                    }
            }
        });
        fm.txtPatron7.addKeyListener(new KeyAdapter(){
        
            @Override
            public void keyTyped(KeyEvent e){
                char caracter = e.getKeyChar();
                String txt = fm.txtPatron7.getText();
                    if(( (caracter < '0') ||(caracter > '9')) &&(caracter != '\b') && ((caracter<'.') || caracter>'.'))
                    {
                       e.consume(); 
                    }else{
                        fm.lblErrorPatron7.setText("");
                    }
            }
        });
        fm.txtPatron8.addKeyListener(new KeyAdapter(){
            @Override
            public void keyTyped(KeyEvent e){
                char caracter = e.getKeyChar();
                String txt = fm.txtPatron8.getText();
                    if(( (caracter < '0') ||(caracter > '9')) &&(caracter != '\b') && ((caracter<'.') || caracter>'.'))
                    {
                       e.consume(); 
                    }else{
                        fm.lblErrorPatron8.setText("");
                    }
            }
        });
        fm.txtAbsMuestra.addKeyListener(new KeyAdapter(){
            @Override
            public void keyTyped(KeyEvent e){
                char caracter = e.getKeyChar();
                String txt = fm.txtAbsMuestra.getText();
                    if(( (caracter < '0') ||(caracter > '9')) &&(caracter != '\b') && ((caracter<'.') || caracter>'.'))
                    {
                       e.consume(); 
                    }else{
                        fm.lblErrorAbs.setText("");
                    }
            }
        });
        fm.btnObt.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me){
                String cmbPatron = fm.cmbPatron.getSelectedItem().toString();
                if(cmbPatron.equals("3")){
                    concentracion3Patrones(fm);
                }else{
                    if(cmbPatron.equals("4")){
                        concentracion4Patrones(fm);
                    }
                }  
            }
        });
        fm.btnTabla.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me){
                fm.panelTabla.setVisible(true);
            }
        
        });
    }
    public void concentracion4Patrones(FrameMain fm){
        String txt1 = fm.txtPatron1.getText();
                String txt2 = fm.txtPatron2.getText();
                String txt3 = fm.txtPatron3.getText();
                String txt4 = fm.txtPatron4.getText();
                String txt5 = fm.txtPatron5.getText();
                String txt6 = fm.txtPatron6.getText();
                
                String txt7 = fm.txtPatron7.getText();
                String txt8 = fm.txtPatron8.getText();
                String abs = fm.txtAbsMuestra.getText();

                int cont = 0;
                do{ cont++;
                    switch(cont){
                        case 1:
                            if(txt1.isEmpty()){
                                fm.lblErrorPatron1.setForeground(Color.red);
                                fm.lblErrorPatron1.setText("Rellene este campo");
                                fm.lblErrorPatron1.setVisible(true);
//                                fm.lblErrorIcon.setVisible(true);
                            }

                            break;
                        case 2:
                            if(txt2.isEmpty()){
                                fm.lblErrorPatron2.setForeground(Color.red);
                                fm.lblErrorPatron2.setText("Rellene este campo");
                            }
                            break;
                        case 3:
                            if(txt3.isEmpty()){
                                fm.lblErrorPatron3.setForeground(Color.red);
                                fm.lblErrorPatron3.setText("Rellene este campo");
                            }
                            break;
                        case 4:
                            if(txt4.isEmpty()){
                                fm.lblErrorPatron4.setForeground(Color.red);
                                fm.lblErrorPatron4.setText("Rellene este campo");
                            }
                            break;
                        case 5:
                            if(txt5.isEmpty()){
                                fm.lblErrorPatron5.setForeground(Color.red);
                                fm.lblErrorPatron5.setText("Rellene este campo");
                            }
                            break;
                        case 6:
                            if(txt6.isEmpty()){
                                fm.lblErrorPatron6.setForeground(Color.red);
                                fm.lblErrorPatron6.setText("Rellene este campo");
                            }
                            break;
                        case 7:
                            if(txt7.isEmpty()){
                                fm.lblErrorPatron7.setForeground(Color.red);
                                fm.lblErrorPatron7.setText("Rellene este campo");
                            }
                            break;
                        case 8:
                            if(txt8.isEmpty()){
                                fm.lblErrorPatron8.setForeground(Color.red);
                                fm.lblErrorPatron8.setText("Rellene este campo");
                            }
                            break;
                        case 9:
                            if(abs.isEmpty()){
                                fm.lblErrorAbs.setForeground(Color.red);
                                fm.lblErrorAbs.setText("Rellene este campo");
                            }
                            break;
                    }
                
                }while(cont<10);
                
                if((txt1.isEmpty()) || (txt2.isEmpty()) || (txt3.isEmpty()) || (txt4.isEmpty()) || (txt5.isEmpty())
                        || (txt6.isEmpty()) || (txt7.isEmpty()) || (txt8.isEmpty()) || (abs.isEmpty())){
                    
                }else{
                    calcularCon4(fm);
                    if (fm.txtResult.getText().length()==0 || fm.txtAbsMuestra.getText().length()==0 ) {
                        System.out.println("Campos Vacios");
                    } else {
                        guardar(fm);
                    }
                }
    
    }
    public void concentracion3Patrones(FrameMain fm){
        
        
                String txt1 = fm.txtPatron1.getText();
                String txt2 = fm.txtPatron2.getText();
                String txt3 = fm.txtPatron3.getText();
                String txt4 = fm.txtPatron4.getText();
                String txt5 = fm.txtPatron5.getText();
                String txt6 = fm.txtPatron6.getText();
                String abs = fm.txtAbsMuestra.getText();

                int cont = 0;
                do{ cont++;
                    switch(cont){
                        case 1:
                            if(txt1.isEmpty()){
                                fm.lblErrorPatron1.setForeground(Color.red);
                                fm.lblErrorPatron1.setText("Rellene este campo");
                                fm.lblErrorPatron1.setVisible(true);
//                                fm.lblErrorIcon.setVisible(true);
                            }

                            break;
                        case 2:
                            if(txt2.isEmpty()){
                                fm.lblErrorPatron2.setForeground(Color.red);
                                fm.lblErrorPatron2.setText("Rellene este campo");
                            }
                            break;
                        case 3:
                            if(txt3.isEmpty()){
                                fm.lblErrorPatron3.setForeground(Color.red);
                                fm.lblErrorPatron3.setText("Rellene este campo");
                            }
                            break;
                        case 4:
                            if(txt4.isEmpty()){
                                fm.lblErrorPatron4.setForeground(Color.red);
                                fm.lblErrorPatron4.setText("Rellene este campo");
                            }
                            break;
                        case 5:
                            if(txt5.isEmpty()){
                                fm.lblErrorPatron5.setForeground(Color.red);
                                fm.lblErrorPatron5.setText("Rellene este campo");
                            }
                            break;
                        case 6:
                            if(txt6.isEmpty()){
                                fm.lblErrorPatron6.setForeground(Color.red);
                                fm.lblErrorPatron6.setText("Rellene este campo");
                            }
                            break;
                        case 7:
                            if(abs.isEmpty()){
                                fm.lblErrorAbs.setForeground(Color.red);
                                fm.lblErrorAbs.setText("Rellene este campo");
                            }
                            break;
                    }
                
                }while(cont<8);
                
                if((txt1.isEmpty()) || (txt2.isEmpty()) || (txt3.isEmpty()) || (txt4.isEmpty()) || (txt5.isEmpty())
                        || (txt6.isEmpty()) || (abs.isEmpty())){
                    
                }else{
                    calcularCon(fm);
                    if (fm.txtResult.getText().length()==0 || fm.txtAbsMuestra.getText().length()==0 ) {
                        System.out.println("Campos Vacios");
                    } else {
                        guardar(fm);
                    }
                }
                
                
    }
    
    public void guardar(FrameMain fm) {
        try {
            DefaultTableModel modelo = (DefaultTableModel) fm.tablaCon.getModel();
            
            Object[] fila = new Object[4];
            int n = fm.tablaCon.getRowCount();
            
            String nt = String.valueOf(n);
            fila[0] = nt;
            fila[1] = fm.txtResult.getText();
            fila[2] = fm.txtAbsMuestra.getText();
            fila[3] = fm.txtResultR.getText();

            //Sección 4
            modelo.addRow(fila);

            fm.tablaCon.setModel(modelo);
            
        } catch (Exception e) {
        }

    }
    
    public void limpiar(FrameMain fm){
        fm.txtPatron1.setText("");
        fm.txtPatron2.setText("");
        fm.txtPatron3.setText("");
        fm.txtPatron4.setText("");
        fm.txtPatron5.setText("");
        fm.txtPatron6.setText("");
        fm.txtPatron7.setText("");
        fm.txtPatron8.setText("");
        fm.txtAbsMuestra.setText("");
        fm.txtResult.setText("");
        fm.txtResultR.setText("");
        fm.lblEcuacion.setText("");
    }
    
    public void calcularCon4(FrameMain fm){
        
        try{
            String x1_s = fm.txtPatron1.getText();
            float x1= Float.parseFloat(x1_s);
            String y1_s = fm.txtPatron2.getText();
            float y1= Float.parseFloat(y1_s);

            String x2_s = fm.txtPatron3.getText();
            float x2= Float.parseFloat(x2_s);
            String y2_s = fm.txtPatron4.getText();
            float y2= Float.parseFloat(y2_s);
            
            String x3_s = fm.txtPatron5.getText();
            float x3= Float.parseFloat(x3_s);
            String y3_s = fm.txtPatron6.getText();
            float y3= Float.parseFloat(y3_s);
            
            String x4_s = fm.txtPatron7.getText();
            float x4= Float.parseFloat(x4_s);
            String y4_s = fm.txtPatron8.getText();
            float y4= Float.parseFloat(y4_s);
            
            m.setX1(x1);
            m.setY1(y1);
            m.setX2(x2);
            m.setY2(y2);
            m.setX3(x3);
            m.setY3(y3);
            m.setX4(x4);
            m.setY4(y4);
            
           float mC = m.calcularM4();
            
            con.setM(m);
            float sumX = m.getSumaX();
            float sumY = m.getSumaY();
            
            eL.setSumaX(sumX);
            eL.setSumaY(sumY);
            eL.setM(mC);
            float b = eL.calcularB4();
            
            String abs_s = fm.txtAbsMuestra.getText();
            float abs = Float.parseFloat(abs_s);
            
            con.setAbs(abs);
            con.setB(b);
            
            float conResult = con.calcularConcentracion4();
            
            String conResult_s = String.valueOf(conResult);
            
            fm.txtResult.setText(conResult_s);
            float r = con.calcularR4();
            String rResult_s = String.valueOf(r);
            
            fm.txtResultR.setText(rResult_s);
            
            DecimalFormatSymbols separadoresPersonalizados = new DecimalFormatSymbols();
            separadoresPersonalizados.setDecimalSeparator('.');
            
            DecimalFormat formato2 = new DecimalFormat("#.###");
            String bE = formato2.format(eL.getB());
            String mE = formato2.format(eL.getM()); 
            
            String ecuacion = mE+"x"+"+"+bE;
            fm.lblEcuacion.setText(ecuacion);
            graficar(fm,eL,"4");
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(fm, "Error");
        }
        
    }
    
    public void calcularCon(FrameMain fm){
        
        try{
            String x1_s = fm.txtPatron1.getText();
            float x1= Float.parseFloat(x1_s);
            String y1_s = fm.txtPatron2.getText();
            float y1= Float.parseFloat(y1_s);

            String x2_s = fm.txtPatron3.getText();
            float x2= Float.parseFloat(x2_s);
            String y2_s = fm.txtPatron4.getText();
            float y2= Float.parseFloat(y2_s);
            
            String x3_s = fm.txtPatron5.getText();
            float x3= Float.parseFloat(x3_s);
            String y3_s = fm.txtPatron6.getText();
            float y3= Float.parseFloat(y3_s);
            
            m.setX1(x1);
            m.setY1(y1);
            m.setX2(x2);
            m.setY2(y2);
            m.setX3(x3);
            m.setY3(y3);
            
           float mC = m.calcularM();
            
            con.setM(m);
            float sumX = m.getSumaX();
            float sumY = m.getSumaY();
            
            eL.setSumaX(sumX);
            eL.setSumaY(sumY);
            eL.setM(mC);
            float b = eL.calcularB();
            
            String abs_s = fm.txtAbsMuestra.getText();
            float abs = Float.parseFloat(abs_s);
            
            con.setAbs(abs);
            con.setB(b);
            
            float conResult = con.calcularConcentracion();
            
            String conResult_s = String.valueOf(conResult);
            
            fm.txtResult.setText(conResult_s);
            float r = con.calcularR();
            String rResult_s = String.valueOf(r);
            
            fm.txtResultR.setText(rResult_s);
            
            DecimalFormatSymbols separadoresPersonalizados = new DecimalFormatSymbols();
            separadoresPersonalizados.setDecimalSeparator('.');
            
            DecimalFormat formato2 = new DecimalFormat("#.###");
            String bE = formato2.format(eL.getB());
            String mE = formato2.format(eL.getM()); 
            
            String ecuacion = mE+"x"+"+"+bE;
            fm.lblEcuacion.setText(ecuacion);
            graficar(fm,eL,"3");
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(fm, "Error");
        }  
    }

    public void graficar(FrameMain fm,EcuacionLineal eL,String tipo){
        JFreeChart grafico = null;
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        DefaultXYDataset dat = new DefaultXYDataset();
        
        int pC = fm.PanelG.getComponentCount();
        if(pC>0){
            fm.PanelG.removeAll();
        }

        float dato1 = Float.parseFloat(fm.txtPatron1.getText());
        float dato2 = Float.parseFloat(fm.txtPatron2.getText());
        float dato3 = Float.parseFloat(fm.txtPatron3.getText());
        float dato4 = Float.parseFloat(fm.txtPatron4.getText());
        float dato5 = Float.parseFloat(fm.txtPatron5.getText());
        float dato6 = Float.parseFloat(fm.txtPatron6.getText());
        
        
        
        if(tipo.equals("3")){
            float e1 = eL.calcularFX(dato1);
            float e2 = eL.calcularFX(dato5);
            double data[][] = {{dato1,dato5},{e1,e2}};
            double data1[][] = {{dato1},{dato2}};
            double data2[][] = {{dato3},{dato4}};
            double data3[][] = {{dato5},{dato6}};
        
            dat.addSeries("Línea", data);
            dat.addSeries("Patrón 1", data1);
            dat.addSeries("Patrón 2", data2);
            dat.addSeries("Patrón 3", data3);
        }else{
           if(tipo.equals("4")){
               float dato7 = Float.parseFloat(fm.txtPatron7.getText());
               float dato8 = Float.parseFloat(fm.txtPatron8.getText());
                float e1 = eL.calcularFX(dato1);
                float e2 = eL.calcularFX(dato7);
                double data[][] = {{dato1,dato7},{e1,e2}};
                double data1[][] = {{dato1},{dato2}};
                double data2[][] = {{dato3},{dato4}};
                double data3[][] = {{dato5},{dato6}};
                double data4[][] = {{dato7},{dato8}};
                
                dat.addSeries("Línea", data);
                dat.addSeries("Patrón 1", data1);
                dat.addSeries("Patrón 2", data2);
                dat.addSeries("Patrón 3", data3);
                dat.addSeries("Patrón 4", data4);
                
            }
        }
        String tipoGrafica = "Lineal"; //
        String tipoMuestra = fm.cmbGrafica.getSelectedItem().toString();
        String etiqueta = "Curva "+tipoMuestra;
        if(tipoGrafica.equals("Lineal")){
            grafico = ChartFactory.createXYLineChart(etiqueta, "Concentración", "Absorbancia",dat ,PlotOrientation.VERTICAL, true, true, false);
            
        XYPlot xyplot = (XYPlot) grafico.getPlot();
        final XYLineAndShapeRenderer renderer = (XYLineAndShapeRenderer)xyplot.getRenderer();
                renderer.setSeriesShapesVisible(0, true);
		renderer.setSeriesShapesVisible(1, true);
		renderer.setSeriesPaint(0, Color.GREEN);
                renderer.setSeriesPaint(1, Color.RED);
                renderer.setSeriesPaint(2, Color.ORANGE);
                renderer.setSeriesPaint(3, Color.BLUE);
                renderer.setSeriesPaint(4, Color.DARK_GRAY);
                
                
        grafico.setBorderPaint(Color.GREEN);
        
        xyplot.setBackgroundPaint( Color.white );
        xyplot.setDomainGridlinePaint( Color.BLACK );
        xyplot.setRangeGridlinePaint( Color.BLACK ); 
        xyplot.setDomainGridlinePaint(Color.GREEN);
        xyplot.setDomainCrosshairPaint(Color.BLUE);
        xyplot.setDomainMinorGridlinePaint(Color.PINK);
        xyplot.setDomainZeroBaselinePaint(Color.cyan);
        xyplot.setNoDataMessagePaint(Color.ORANGE);
        xyplot.setOutlinePaint(Color.MAGENTA);
        xyplot.setRangeCrosshairPaint(Color.YELLOW);
        xyplot.setRangeGridlinePaint(Color.DARK_GRAY);
        xyplot.setRangeMinorGridlinePaint(Color.yellow);
        XYLineAndShapeRenderer xylineandshaperenderer = (XYLineAndShapeRenderer) xyplot.getRenderer();
        xylineandshaperenderer.setBaseShapesVisible(true);
        XYItemLabelGenerator xy = new StandardXYItemLabelGenerator();
        xylineandshaperenderer.setBaseItemLabelGenerator( xy );
        xylineandshaperenderer.setBaseItemLabelsVisible(true);
        xylineandshaperenderer.setBaseLinesVisible(true);
        xylineandshaperenderer.setBaseItemLabelsVisible(false);                
        }
        ChartPanel cPanel = new ChartPanel(grafico);
        fm.PanelG.setLayout(new BorderLayout());
        fm.PanelG.add(cPanel);
        fm.PanelG.validate();
        
    }
}
