package mil.army.natick.atcl;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	/**
	 * 
	 * @param view
	 */
	public void onStatusActivityButtonClick(View view) {
		Log.w("ATCL", "onStatusActivityButtonClick -- excuted!!!");
		Context context = view.getContext();
		startActivity(new Intent(context, mil.army.natick.atcl.StatusActivity.class));			
	}
	/**
	 * 
	 * @param view
	 */
	public void onFieldStripActivityButtonClick(View view) {
		Log.w("ATCL", "onFieldStripActivityButtonClick -- excuted!!!");
		Context context = view.getContext();
		startActivity(new Intent(context, mil.army.natick.atcl.FieldStripActivity.class));			
	}
	/**
	 * 
	 * @param view
	 */
	public void onProfileActivityButtonClick(View view) {
		Log.w("ATCL", "onProfileActivityButtonClick -- excuted!!!");
		Context context = view.getContext();
		startActivity(new Intent(context, mil.army.natick.atcl.ProfileActivity.class));			
	}
	/**
	 * 
	 * @param view
	 */
	public void onTestDriveActivityButtonClick(View view) {
		Log.w("ATCL", "onTestDriveActivityButtonClick -- excuted!!!");
		Context context = view.getContext();
		startActivity(new Intent(context, mil.army.natick.atcl.TestDrive.class));			
	}
}
