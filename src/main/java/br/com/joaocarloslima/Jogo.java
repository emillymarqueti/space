package br.com.joaocarloslima;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Jogo {
    protected List<Asset> assets = new ArrayList<>();
    protected Nave nave = new Nave(280, 400, 10, Direcao.DIREITA);
    private int pontos;
    private int nivel = 1;

    public Tiro atirar() {
        Tiro t = nave.atirar(nivel);
        assets.add(t);
        return t;
    }

    public Meteoro criarMeteoro() {
        Random random = new Random();
        int posX = random.nextInt(590);
        Meteoro m = new Meteoro(posX, 0, 2, Direcao.BAIXO);
        assets.add(m);
        return m;
    }

    public void pontuar() {
        pontos++;
        if (pontos % 10 == 0 && nivel < 4) {
            nivel++;
        }
    }

    public List<Asset> getAssets() {
        return assets;
    }

    public Nave getNave() {
        return nave;
    }

    public int getPontos() {
        return pontos;
    }

    public int getNivel() {
        return nivel;
    }
}