package wenke.makelove.butterknifeexecise;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by wenke on 09/12/2016.
 */
public class ButterKnifeFramgnet extends Fragment {
    @BindView(R.id.button)
    Button button;
    @BindView(R.id.imagef)
    ImageView imagef;
    private Button buttonf;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_butterknife, null);
        ButterKnife.bind(this, view);
        buttonf = ButterKnife.findById(view, R.id.buttonf);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        imagef.setImageResource(R.mipmap.girl);
        buttonf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"ButterKnife.findById 验证成功",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @OnClick(R.id.button)
    public void onClick() {
        Toast.makeText(getContext(), "butterknife验证点击事件成功", Toast.LENGTH_SHORT).show();
    }
}
