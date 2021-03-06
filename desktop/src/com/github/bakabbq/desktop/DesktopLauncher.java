package com.github.bakabbq.desktop;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.github.bakabbq.DanmakuGame;
import com.github.bakabbq.GdxGround;
import com.github.bakabbq.shooters.players.DesktopControlHelper;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "东风谷早苗的弹幕训练 Demo v0.01";
        config.width = 640;
        config.height = 480;
        new LwjglApplication(DanmakuGame.getInstance(),config);
	}
}
