package com.Axeryok.CocoaInput.impl;


public interface IMEOperator {
	public void setFocused(boolean inFocused);//保持するIMEのフォーカスが変化した時に呼び出される
	public void discardMarkedText();//実装してないので呼び出されない（いつか実装する）
	
	//TODO removeInstanceを実装する（現時点では呼ばれない）
	public void removeInstance();//看板や本の編集が終わった時に呼び出される　テキストフィールドは廃棄位置が曖昧なため呼び出されない
}
