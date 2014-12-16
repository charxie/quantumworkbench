package org.concord.qm2d.view;

import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;

/**
 * @author Charles Xie
 * 
 */
class MovingRoundRectangle implements MovingShape {

	private RoundRectangle2D.Float roundRectangle;

	MovingRoundRectangle(RoundRectangle2D.Float roundRectangle) {
		this.roundRectangle = roundRectangle;
	}

	public Shape[] getShapes() {
		return new Shape[] { roundRectangle };
	}

	public void render(Graphics2D g) {
		g.draw(roundRectangle);
	}

}
