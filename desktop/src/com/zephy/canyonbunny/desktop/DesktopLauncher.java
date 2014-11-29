package com.zephy.canyonbunny.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.zephy.canyonbunny.CanyonBunnyMain;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.height = 480;
		config.width = 800;
		new LwjglApplication(new CanyonBunnyMain(), config);
	}
}
