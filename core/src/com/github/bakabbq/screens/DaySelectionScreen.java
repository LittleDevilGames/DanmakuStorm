package com.github.bakabbq.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.Array;
import com.github.bakabbq.DanmakuGame;
import com.github.bakabbq.screens.dayselection.StageData;
import com.github.bakabbq.screens.title.BackgroundSprite;

import java.io.File;

/**
 * Created by LBQ on 8/30/14.
 */
public class DaySelectionScreen implements Screen{
    DanmakuGame game;
    BackgroundSprite bgSprite;
    AllblackSprite allblackSprite;
    Texture curtain;
    int timer;
    public DaySelectionScreen(){
        game = DanmakuGame.getInstance();
        bgSprite = new BackgroundSprite();
        allblackSprite = new AllblackSprite();
        curtain = new Texture("title/blackCurtain.png");
        timer = 0;
        Array<StageData> stages = StageData.parseAllStages(new File("stage_infos"));
    }

    @Override
    public void render(float delta) {
        timer++;
        game.batch.begin();
        trueRendering();
        game.batch.end();
        updateKeys();
    }

    public void trueRendering(){
        bgSprite.update(game.batch);
        game.batch.draw(curtain,0,0);
        allblackSprite.draw(game.batch,Math.max(30 - timer,0)/30f);
    }

    public void updateKeys(){
        if(Gdx.input.isKeyPressed(Input.Keys.X)){
            game.switchToTitle();
        }
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void show() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }
}
