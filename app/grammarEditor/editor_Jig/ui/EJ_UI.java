package org.fleen.forsythia.app.grammarEditor.editor_Jig.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class EJ_UI extends JPanel{
  
  public JPanel pantop;
  public EJ_Grid pangrid;
  public JLabel lblinfo;
  
  public PanResetSaveQuit panresetsavequit;
  public PanGridDensity pangriddensity;
  public PanGeometryLock pangeometrylock;
  public PanJigTag panjigtag;
  public PanSectionChorus pansectionchorus;
  public PanSectionAnchor pansectionanchor;
  public PanSectionTag pansectiontag;

  public EJ_UI(){
    setLayout(new BorderLayout(0, 0));
    
    pantop = new JPanel();
    add(pantop, BorderLayout.NORTH);
    WrapLayout layouttop=new WrapLayout();
    layouttop.setAlignment(FlowLayout.LEFT);
    pantop.setLayout(layouttop);
    
    panresetsavequit = new PanResetSaveQuit();
    pantop.add(panresetsavequit);
    
    pangriddensity = new PanGridDensity();
    pantop.add(pangriddensity);
    
    pangeometrylock = new PanGeometryLock();
    pantop.add(pangeometrylock);    
    
    panjigtag = new PanJigTag();
    pantop.add(panjigtag);
    
    pansectionchorus = new PanSectionChorus();
    pantop.add(pansectionchorus);
    
    pansectionanchor = new PanSectionAnchor();
    pantop.add(pansectionanchor);
    
    pansectiontag = new PanSectionTag();
    pantop.add(pansectiontag);
    
    pangrid = new EJ_Grid();
    add(pangrid, BorderLayout.CENTER);
    
    JPanel panbot = new JPanel();
    add(panbot, BorderLayout.SOUTH);
    
    lblinfo = new JLabel("polygon count, geometry validity, etc... foo foo foo");
    panbot.add(lblinfo);
    
  }
}
