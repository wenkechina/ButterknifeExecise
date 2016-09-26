package wenke.makelove.butterknifeexecise;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ButterKnifeInViewHolder extends AppCompatActivity {

    @BindView(R.id.list)
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_butter_knife_in_view_holder);
        ButterKnife.bind(this);
        list.setAdapter(new MyAdatper());
    }
    class MyAdatper extends BaseAdapter {

        @Override
        public int getCount() {
            return 20;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = View.inflate(getApplicationContext(), R.layout.listview_item, null);
            }
            ViewHolder viewHolder = ViewHolder.getHolder(convertView);
            assignView(viewHolder);
            return convertView;
        }
        private void assignView(ViewHolder viewHolder) {
            viewHolder.text.setText("beautiful girl makelove with her !");
            viewHolder.image.setImageResource(R.mipmap.umeng_update_close_bg_tap);
        }
    }
    static class ViewHolder {
        @BindView(R.id.image)
        ImageView image;
        @BindView(R.id.text)
        TextView text;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
        public static ViewHolder getHolder(View convertView) {
            ViewHolder myViewHolder = (ViewHolder) convertView.getTag();
            if (myViewHolder == null) {
                myViewHolder = new ViewHolder(convertView);
                convertView.setTag(myViewHolder);
            }
            return myViewHolder;
        }
    }
}
