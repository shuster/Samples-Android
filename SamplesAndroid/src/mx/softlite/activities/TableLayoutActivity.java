package mx.softlite.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class TableLayoutActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		TextView textView = new TextView(this);
		textView.setText("This is Tablet Layout View");
		setContentView(textView);
	}

}
