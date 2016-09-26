package wenke.makelove.butterknifeexecise;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;

/**
 * 完美的展示一张占满屏幕宽度的图片  ，根据宽高比 对图片的高度进行处理 达到适配
 * 在xml中用的时候 需要设置 percentage的值  width/height
 * 如果没设置percentage 就和普通imageView一样使用，视开发需求而定
 * 如果imageview不在这里处理，那么只能在容器中（activity，fragment等）中处理，例如
		 ImageView image = (ImageView) findViewById(R.id.image);
		 int width = getWindowManager().getDefaultDisplay().getWidth();
		 int height = (int) (width / 1.6f);
		 image.getLayoutParams().height = height;
		 image.requestLayout();
 */
public class BestImageView extends ImageView{
	private float percentage;//宽高比
	private float height;

	public BestImageView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}
	public BestImageView(Context context, AttributeSet attrs) {
		super(context, attrs);
		TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.BestImageView);
		percentage = a.getFloat(R.styleable.BestImageView_percentage, 0);
		Log.e("makelove", "percentage=" + this.percentage);
	}
	public BestImageView(Context context) {
		super(context);
	}
	
	//设置宽高比
	public void setPercentage(float percentage){
		this.percentage = percentage;
	}
	
	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		int width = MeasureSpec.getSize(widthMeasureSpec);//获取图片的宽度
		Log.e("makelove","width="+width);
		if(percentage !=0){
			height = width/ percentage;
			heightMeasureSpec = MeasureSpec.makeMeasureSpec((int) height, MeasureSpec.EXACTLY);
		}
		super.onMeasure(widthMeasureSpec, heightMeasureSpec);
	}
}
