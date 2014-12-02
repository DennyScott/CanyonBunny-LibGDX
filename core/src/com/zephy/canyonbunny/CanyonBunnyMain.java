package com.zephy.canyonbunny;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.zephy.canyonbunny.game.WorldController;
import com.zephy.canyonbunny.game.WorldRenderer;
import com.zephy.canyonbunny.util.Assets;

public class CanyonBunnyMain extends ApplicationAdapter {
	private WorldController worldController;
	private WorldRenderer worldRenderer;
	private boolean paused;

	@Override
	public void create () {
		//Set Libgdx log level to DEBUG

		Gdx.app.setLogLevel(Application.LOG_DEBUG);
		
		//Load assets
		Assets.instance.init(new AssetManager());

		//Initalize controller and renderer
		worldController = new WorldController();
		worldRenderer = new WorldRenderer(worldController);

		//Game world is active on start
		paused = false;
	}

	@Override
	public void render () {
		//Do not update game world when paused
		if(!paused){
			//Update game world by the time that has passed since last rendered frame
			worldController.update(Gdx.graphics.getDeltaTime());
			//Sets the clear screencolor to:Cornflower Blue
			Gdx.gl.glClearColor(0x64/255.0f, 0x95/255.0f, 0xed/255.0f, 0xff/255.0f);
			//Clears teh Screen
			Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
			//Render game world to screen
			worldRenderer.render();
		}

	}

	@Override
	public void resize(int width, int height) {
		worldRenderer.resize(width, height);
	}

	@Override
	public void pause() {
		paused = true;
	}

	@Override
	public void resume() {
		Assets.instance.init(new AssetManager());
		paused = false;
	}

	@Override public void dispose() {
		worldRenderer.dispose();
		Assets.instance.dispose();
	}
}
