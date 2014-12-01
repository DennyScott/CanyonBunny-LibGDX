import static org.junit.Assert.*;

import com.zephy.canyonbunny.CanyonBunnyMain;
import com.zephy.canyonbunny.game.*;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import org.junit.Test;

public class WorkingTests {

	@Test
	public void test() {
		createApplication();
		WorldController wc = new WorldController();
		assertTrue(wc.ITrue());
	}
	
	public static LwjglApplication createApplication() {
		 LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		 CanyonBunnyMain game = new CanyonBunnyMain();
		 return new LwjglApplication(game, cfg);
	}


}
