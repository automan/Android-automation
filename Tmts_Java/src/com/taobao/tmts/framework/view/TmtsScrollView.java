/* TMTS - Android automation testing Framework.
 Copyright (C) 2010-2011 TaoBao UI AutoMan Team

 This program is free software; you can redistribute it and/or
 modify it under the terms of the GNU General Public License
 as published by the Free Software Foundation; either version 2
 of the License, or (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program; if not, write to the Free Software
 Foundation, Inc., HuaXing road, Hangzhou,China. 
 Email:taichan@taobao.com,shidun@taobao.com,bingyang@taobao.com
*/
package com.taobao.tmts.framework.view;

import android.app.Instrumentation;
import android.widget.ScrollView;

/**
 * Taobao Android Test Framework Class for {@link ScrollView}.
 * @author bingyang.djj
 * Added in 2011-05-24
 */
public class TmtsScrollView extends TmtsFrameLayout{
	private static final String LOG_TAG = "TmtsScrollView";
	private ScrollView scrollView;
    
	/**
	 * Constructor of {@link TmtsScrollView}.
	 * @param inst {@link Instrumentation}.
	 * @param scrollView {@link ScrollView}.
	 */
	public TmtsScrollView(Instrumentation inst, ScrollView scrollView) {
		super(inst, scrollView);
		this.scrollView = scrollView;
	}
	
	/**
	 * Set the scrolled position of your view.
	 * @param x the x position to scroll to
	 * @param y the y position to scroll to
	 */
	public void scrollTo(final int x, final int y) {
		inst.runOnMainSync(new Runnable() {
			
			@Override
			public void run() {
				scrollView.scrollTo(x, y);
			}
		});
	}
	
	/**
	 * Move the scrolled position of your view.
	 * @param x the amount of pixels to scroll by horizontally
	 * @param y the amount of pixels to scroll by horizontally
	 */
	public void scrollBy(final int x, final int y) {
		inst.runOnMainSync(new Runnable() {
			
			@Override
			public void run() {
				scrollView.scrollBy(x, y);
			}
		});
	}
	
	/**
	 * Handles scrolling in response to a "home/end" shortcut press. 
	 * This method will scroll the view to the top or bottom and give the focus to the topmost/bottommost component in the new visible area. 
	 * If no component is a good candidate for focus, this scrollview reclaims the focus.
	 * @param direction the scroll direction: android.view.View.FOCUS_UP to go the top of the view or 
	 * android.view.View.FOCUS_DOWN to go the bottom
	 */
	public void fullScroll(final int direction) {
		inst.runOnMainSync(new Runnable() {
			
			@Override
			public void run() {
				scrollView.fullScroll(direction);
			}
		});
	}
}
