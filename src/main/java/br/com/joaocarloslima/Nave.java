package br.com.joaocarloslima;

import javafx.scene.image.ImageView;

public class Nave extends Asset {

    public Nave(int x, int y, int velocidade, Direcao direcao) {
        super(x, y, velocidade, direcao);
        this.imagem = new ImageView(App.class.getResource("/br/com/joaocarloslima/images/ships/playerShip1_blue.png").toString());
    }

    public Tiro atirar(int poder) {
        return new Tiro(this.x, this.y, 10, Direcao.CIMA, poder);
    }

    @Override
    public void mover() {
        super.mover();
        if (x < 0) {
            x = 0;
        }
        if (x > 590) {
            x = 590;
        }
    }
}