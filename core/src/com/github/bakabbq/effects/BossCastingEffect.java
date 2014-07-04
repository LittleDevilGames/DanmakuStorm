package com.github.bakabbq.effects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * Created by LBQ on 6/28/14.
 */
public class BossCastingEffect extends ThEffect{

    public BossCastingEffect(){
        super();
        zoomTo(1.2f);
    }

    @Override
    public void initTexture(){
        this.texture = new TextureRegion(mainTexture, 128, 64 + 16, 128, 128);
    }

    @Override
    public void onCreation(){
        this.opacity += 0.2f;
        if(this.opacity >= 1.0f){
            this.opacity = 1.0f;
            nextState();
        }
    }

    @Override
    public void onDispose(){
        this.opacity -= 0.2f;
        if(this.opacity <= 0.0f){
            this.opacity = 0.0f;
            nextState();
        }
    }

    @Override
    public void onMainUpdate(){
        this.angle+=2;
    }

}
