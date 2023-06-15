package com.caojing.Game2048.entity;

/**
 * 记录卡片的位置实体
 */
public class MPoint {

  private   int x;    //横向
  private   int y;    //纵向

    public MPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
