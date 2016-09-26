package wenke.makelove.butterknifeexecise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ButterKnifeInFragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_butter_knife_in_fragment);
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,new ButterKnifeFramgnet()).commit();
    }
}
