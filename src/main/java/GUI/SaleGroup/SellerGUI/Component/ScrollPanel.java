/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.SaleGroup.SellerGUI.Component;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author huykh
 * @param <MyData>
 * @param <MyPanel>
 */

// MyPanel is a class to contain data (like OrderItem, MenuItem). MyPanel extend Component so we can use panel.add (at line 57)
// MyPanel extends interface IGetData because we need a function that call to get data from MyPanel
// MyData is data type that we get from MyPanel (like ChiTietSanPham, SanPham).
public class ScrollPanel<MyData,MyPanel extends Component & IGetData<MyData>> extends JScrollPane{
    private final JPanel panel;
    private int width;
    private int height;
    private int hGap = 10;
    private int wGap = 10;
    private final List<MyData> listData = new ArrayList<>();
    
    public ScrollPanel(int width, int height){
        panel = new JPanel();
        this.setViewportView(panel);
        this.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        this.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        this.setBorder(BorderFactory.createEmptyBorder());
        this.setViewportBorder(BorderFactory.createEmptyBorder());
        this.width = width;
        this.height = height;
        this.getVerticalScrollBar().setUnitIncrement(6);
//        this.getVerticalScrollBar().putClientProperty("JScrollBar.showButtons", true);
        panel.setPreferredSize(new Dimension(this.width,this.height));
        this.setBounds(0,0,width,height);
        panel.setLayout(new FlowLayout(FlowLayout.LEFT,wGap,hGap));
        panel.setBackground(Color.decode("#E9F0F3"));
 
//        this.putClientProperty("JScrollBar.width", 50);
//        this.setBorder(null);
//        setOpaque(false);
    }
    
    public MyPanel addToPanel(MyPanel comp){
        Component com = panel.add(comp);
        panel.revalidate();
        panel.repaint();
        panel.setPreferredSize(new Dimension((int)panel.getPreferredSize().getWidth(),calculateHeight()));
        this.listData.add(comp.getData());
//        System.out.println(panel.getPreferredSize());
        return (MyPanel) com;
    }
 
    
    public Dimension getChildComponentSize(){
        if (panel.getComponentCount() == 0)
            return new Dimension(0,0);
        return panel.getComponent(0).getPreferredSize();
    }
    
    private int calculateHeight(){
        if (panel.getComponentCount() == 0 || getChildComponentSize().getWidth() == 0 || getChildComponentSize().getHeight() == 0)
            return (int) panel.getPreferredSize().getHeight();
        int maxInCol = (int) (panel.getPreferredSize().getWidth() / getChildComponentSize().getWidth());
        int maxInRow = (int) (panel.getComponentCount() / maxInCol);
        maxInRow = maxInRow == 0 ? 1 : maxInRow;
        int height = (int) (maxInRow*((getChildComponentSize().getHeight()+1)+(hGap+1)));
        return height;
    }

    public int gethGap() {
        return hGap;
    }

    public void sethGap(int hGap) {
        this.hGap = hGap;
    }

    public int getwGap() {
        return wGap;
    }

    public void setwGap(int wGap) {
        this.wGap = wGap;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
        panel.setPreferredSize(new Dimension(this.width,this.height));
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
        panel.setPreferredSize(new Dimension(this.width,this.height));
    }
    
    public JPanel getPanel(){
        return panel;
    }
    
    public List<MyData> getListData(){
        return listData;
    }
    
//    @Override
//    protected void paintComponent(Graphics g){
//        Graphics2D g2d = (Graphics2D) g.create();
//        g2d.setColor(getBackground());
//        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 50, 50);
//        g2d.dispose();
//        super.paintComponent(g);
//    }
    
}
