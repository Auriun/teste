package interno.poprocket.objetos;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;

public class criaObjetos {

	
	public static Sprite[] Estrelas (int qtd) {
		float x, y;
		Estrela array_estrelas[] = new Estrela[qtd];
		
		for (int i = 0; i < array_estrelas.length; i++) {
			x = MathUtils.random(1050, 2000);
			y = MathUtils.random(100, 5000);
			
			
			array_estrelas[i] = new Estrela(new Texture(Gdx.files.internal("img/estrela.png")));
			array_estrelas[i].setPosition(x, y);
			array_estrelas[i].setSize(15, 15);
			
			
		}
		
		return array_estrelas;		
	}
	
	public static Sprite[] Asteroides(int qtd) {
		float x, y;
		Sprite array_asteroides[] = new Sprite[qtd];
		
		for (int i = 0; i < array_asteroides.length; i++) {
			x = MathUtils.random(1050, 2000);
			y = MathUtils.random(100, 5000);
			
			array_asteroides[i] = new Sprite(new Texture(Gdx.files.internal("img/asteroide.png")));
			array_asteroides[i].setPosition(x, y);
			array_asteroides[i].setSize(20, 20);
		}		
		return array_asteroides;
	}
	
	public static Sprite[] Nuvens(int qtd) {
		float x, y;
		int tipo;
		Sprite array_asteroides[] = new Sprite[qtd];
		
		for (int i = 0; i < array_asteroides.length; i++) {
			x = MathUtils.random(1050, 2000);
			y = MathUtils.random(100, 5000);
			tipo = MathUtils.random(1,3);
			
			array_asteroides[i] = new Sprite(new Texture(Gdx.files.internal("img/nuvem_0"+ tipo +".png")));
			array_asteroides[i].setPosition(x, y);
			
		}		
		return array_asteroides;
	}
	
}
