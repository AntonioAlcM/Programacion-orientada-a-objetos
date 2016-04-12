/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Napakalaki.CombatResult;
import Napakalaki.Napakalaki;
import Napakalaki.Treasure;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.applet.AudioClip;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import javazoom.jl.player.advanced.AdvancedPlayer;
import javazoom.jl.player.advanced.PlaybackEvent;
import javazoom.jl.player.advanced.PlaybackListener;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;


/**
 *
 * @author donas11
 */
public class NapakalakiView extends javax.swing.JFrame {

    Napakalaki NapakalakiModel;
    public boolean puedespasar=true;
    Player player;
    
    /**
     * Creates new form NapakalakiView
     */
    public NapakalakiView() {
        initComponents();
    }
     public void setNapakalaki(Napakalaki n){
     NapakalakiModel=n;
     this.jNextTurn.setEnabled(false);
     this.jCombat.setEnabled(false);
     this.Buy.setEnabled(true);
     playerView1.setPlayer(NapakalakiModel.getCurrentPlayer());
      music();  
      repaint();
    }
    public void music(){
         try {
            player = new Player(new BufferedInputStream(new FileInputStream("../napakalaki_java/src/GUI/Sneaky Snitch.mp3")));
            if(!player.isComplete()){
                player.play();
            }             
                           
        } catch (JavaLayerException | FileNotFoundException e) {
           
        }
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMeetMonster = new javax.swing.JButton();
        jCombat = new javax.swing.JButton();
        jPlayer = new javax.swing.JPanel();
        playerView1 = new GUI.PlayerView();
        jimagenGuerrero = new javax.swing.JLabel();
        jMonstruos = new javax.swing.JPanel();
        monsterView1 = new GUI.MonsterView();
        jNextTurn = new javax.swing.JButton();
        jMakevisible = new javax.swing.JButton();
        Buy = new javax.swing.JButton();
        jDiscard = new javax.swing.JButton();
        jsoundoff = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(getBackground());
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N

        jMeetMonster.setText("Meet the Monster");
        jMeetMonster.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMeetMonster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMeetMonsterActionPerformed(evt);
            }
        });

        jCombat.setText("Combat");
        jCombat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCombatActionPerformed(evt);
            }
        });

        jPlayer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        playerView1.setBackground(new java.awt.Color(2, 2, 86));

        jimagenGuerrero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/guerrero-medieval.jpeg"))); // NOI18N

        jMonstruos.setBackground(new java.awt.Color(150, 6, 6));
        jMonstruos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(162, 15, 15)));

        monsterView1.setBackground(new java.awt.Color(74, 2, 4));

        javax.swing.GroupLayout jMonstruosLayout = new javax.swing.GroupLayout(jMonstruos);
        jMonstruos.setLayout(jMonstruosLayout);
        jMonstruosLayout.setHorizontalGroup(
            jMonstruosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jMonstruosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(monsterView1, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addContainerGap())
        );
        jMonstruosLayout.setVerticalGroup(
            jMonstruosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(monsterView1, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPlayerLayout = new javax.swing.GroupLayout(jPlayer);
        jPlayer.setLayout(jPlayerLayout);
        jPlayerLayout.setHorizontalGroup(
            jPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPlayerLayout.createSequentialGroup()
                .addComponent(playerView1, javax.swing.GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE)
                .addGroup(jPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPlayerLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jimagenGuerrero))
                    .addGroup(jPlayerLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jMonstruos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPlayerLayout.setVerticalGroup(
            jPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(playerView1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPlayerLayout.createSequentialGroup()
                .addComponent(jMonstruos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jimagenGuerrero, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jNextTurn.setText("Next Turn");
        jNextTurn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNextTurnActionPerformed(evt);
            }
        });

        jMakevisible.setText("Make Visible");
        jMakevisible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMakevisibleActionPerformed(evt);
            }
        });

        Buy.setText("Buy Levels");
        Buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyActionPerformed(evt);
            }
        });

        jDiscard.setText("Discard Treasures ");
        jDiscard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDiscardActionPerformed(evt);
            }
        });

        jsoundoff.setText("Sound off");
        jsoundoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsoundoffActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPlayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jMeetMonster)
                        .addGap(42, 42, 42)
                        .addComponent(jCombat)
                        .addGap(52, 52, 52)
                        .addComponent(jNextTurn)
                        .addGap(58, 58, 58)
                        .addComponent(jMakevisible)
                        .addGap(36, 36, 36)
                        .addComponent(Buy)
                        .addGap(18, 18, 18)
                        .addComponent(jDiscard)
                        .addGap(109, 109, 109)
                        .addComponent(jsoundoff))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jMeetMonster))
                    .addComponent(jCombat)
                    .addComponent(jNextTurn)
                    .addComponent(jMakevisible)
                    .addComponent(Buy)
                    .addComponent(jDiscard)
                    .addComponent(jsoundoff))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMeetMonsterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMeetMonsterActionPerformed
        // TODO add your handling code here:
        monsterView1.setMonster(NapakalakiModel.getCurrentMonster());
        this.jCombat.setEnabled(true);
        this.jMeetMonster.setEnabled(false);
    }//GEN-LAST:event_jMeetMonsterActionPerformed

    private void jCombatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCombatActionPerformed
        // TODO add your handling code here:
        CombatResult combatResult=NapakalakiModel.developCombat();
        this.jMeetMonster.setEnabled(false);
        this.jCombat.setEnabled(false);
        this.jMakevisible.setEnabled(false);
        this.Buy.setEnabled(false);
        this.jNextTurn.setEnabled(true);
        switch (combatResult) {
            case WinAndWinGame :
                 NapakalakiModel.endOfGame(combatResult);
                 JOptionPane.showMessageDialog(rootPane,"Has ganado el juego");
                 this.setVisible(false);
                 System.exit(0);
              break;
            case Win :
                if(NapakalakiModel.getCurrentPlayer().validState()){
                this.jNextTurn.setEnabled(true);
                this.jCombat.setEnabled(false);
                this.jMakevisible.setEnabled(false);
                this.Buy.setEnabled(true);
                JOptionPane.showMessageDialog(rootPane,"Has ganado el combate");
                }else{
                    puedespasar=false;
                    this.jCombat.setEnabled(false);
                    this.jNextTurn.setEnabled(false);
                    this.Buy.setEnabled(true);
                    JOptionPane.showMessageDialog(rootPane,"Tienes demasiados tesoros ocultos");
                    
                }
              break;
            case Lose :
              if(!NapakalakiModel.getCurrentPlayer().validState()){
                        
                        puedespasar=false;
                        this.jCombat.setEnabled(false);
                        this.jNextTurn.setEnabled(false);
                        JOptionPane.showMessageDialog(rootPane,"Tienes mal rollo que cumplir");
                }else{
                        
                        this.jNextTurn.setEnabled(true);
                        this.jCombat.setEnabled(false);
                        JOptionPane.showMessageDialog(rootPane,"No hay mal rollo que cumplir");
              }
              break;
            case LoseAndEscape :
                this.jNextTurn.setEnabled(true);
                this.jCombat.setEnabled(false);
                JOptionPane.showMessageDialog(rootPane,"Has perdido el combate pero has conseguido escapar");
              break;
            case LoseAndDie :
                this.jNextTurn.setEnabled(true);
                this.jCombat.setEnabled(false);
                JOptionPane.showMessageDialog(rootPane,"Has perdido el combate y el monstruo ha conseguido darte muerte");
              break;
          }
          monsterView1.setMonster(NapakalakiModel.getCurrentMonster());
          playerView1.setPlayer(NapakalakiModel.getCurrentPlayer());
    }//GEN-LAST:event_jCombatActionPerformed

    private void jNextTurnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNextTurnActionPerformed
        // TODO add your handling code here:
        puedespasar=true;
        NapakalakiModel.nextTurn();
        this.jCombat.setEnabled(true);
        this.jMakevisible.setEnabled(true);
        this.jNextTurn.setEnabled(false);
        this.Buy.setEnabled(true);
        playerView1.setPlayer(NapakalakiModel.getCurrentPlayer());
        monsterView1.setMonster(NapakalakiModel.getCurrentMonster());
    }//GEN-LAST:event_jNextTurnActionPerformed

    private void BuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyActionPerformed
        // TODO add your handling code here:
        ArrayList<Treasure> VisibleTreasures=playerView1.getSelectedTreasures(playerView1.getVisiblesTreasure());
        ArrayList<Treasure>HiddenTreasures=playerView1.getSelectedTreasures(playerView1.getHiddenTreasure());
        NapakalakiModel.buyLevels(VisibleTreasures, HiddenTreasures);
        if(this.NapakalakiModel.getCurrentPlayer().validState() && puedespasar==false){
            this.jNextTurn.setEnabled(true);
        }
        playerView1.setPlayer(NapakalakiModel.getCurrentPlayer());
    }//GEN-LAST:event_BuyActionPerformed

    private void jDiscardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDiscardActionPerformed
        ArrayList<Treasure> selHidden = playerView1.getSelectedTreasures (playerView1.getHiddenTreasure());
        ArrayList<Treasure> selVisible = playerView1.getSelectedTreasures (playerView1.getVisiblesTreasure());
        this.NapakalakiModel.discardHiddenTreasures(selHidden);
        this.NapakalakiModel.discardVisibleTreasures(selVisible);
        if(this.NapakalakiModel.getCurrentPlayer().validState() && puedespasar==false){
            this.jNextTurn.setEnabled(true);
        }
        this.playerView1.setPlayer(NapakalakiModel.getCurrentPlayer());  
    }//GEN-LAST:event_jDiscardActionPerformed

    private void jMakevisibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMakevisibleActionPerformed
        ArrayList<Treasure> selHidden= playerView1.getSelectedTreasures(playerView1.getHiddenTreasure());
        this.NapakalakiModel.makeTreasuresVisible(selHidden);
        this.playerView1.setPlayer(NapakalakiModel.getCurrentPlayer());
    }//GEN-LAST:event_jMakevisibleActionPerformed

    private void jsoundoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsoundoffActionPerformed
                this.player.close();
                this.jsoundoff.setEnabled(false);
    }//GEN-LAST:event_jsoundoffActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public void showView() {
        this.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buy;
    private javax.swing.JButton jCombat;
    private javax.swing.JButton jDiscard;
    private javax.swing.JButton jMakevisible;
    private javax.swing.JButton jMeetMonster;
    private javax.swing.JPanel jMonstruos;
    private javax.swing.JButton jNextTurn;
    private javax.swing.JPanel jPlayer;
    private javax.swing.JLabel jimagenGuerrero;
    private javax.swing.JButton jsoundoff;
    private GUI.MonsterView monsterView1;
    private GUI.PlayerView playerView1;
    // End of variables declaration//GEN-END:variables
}