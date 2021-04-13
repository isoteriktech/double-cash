package com.isoterik.cash4life.double_cash;

import com.isoterik.cash4life.double_cash.scenes.GamePlayScene;
import com.isoterik.mgdx.MinGdxGame;
import com.isoterik.mgdx.Scene;
import com.isoterik.mgdx.m2d.scenes.transition.SceneTransitions;

public class DoubleCash extends MinGdxGame {

	@Override
	protected Scene initGame() {
		minGdx.defaultSettings.VIEWPORT_WIDTH = Constants.GUI_WIDTH;
		minGdx.defaultSettings.VIEWPORT_HEIGHT = Constants.GUI_HEIGHT;

		loadAssets();

		splashTransition = SceneTransitions.fade(1f);
		return new GamePlayScene();
	}

	private void loadAssets() {
		//minGdx.assets.enqueueFolderContents("images", Texture.class);
		minGdx.assets.enqueueAtlas("spritesheets/cards.atlas");
		minGdx.assets.loadAssetsNow();
	}
}
