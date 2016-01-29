package com.study.designpattern.interpreter;

/**
 * @author huqiaonan
 * @date 2016年1月28日 下午5:57:24
 */
public abstract class Expression {

	public void Interpret(PlayContext context) {
		if (context.getText().length() == 0) {
			return;
		} else {
			String playKey = context.getText().substring(0, 1);
			context.setText(context.getText().substring(2));
			double playValue = Double.parseDouble(context.getText().substring(0, context.getText().indexOf(" ")));
			String tmpString = context.getText();
			context.setText(tmpString.substring(tmpString.indexOf(" ") + 1));
			execute(playKey, playValue);
		}
	}

	public abstract void execute(String key, double value);
}
