package com.example.abdullah.viewpager;


        import android.graphics.drawable.Drawable;
        import android.os.Bundle;
        import android.support.v4.app.Fragment;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.TextView;

public class MyFragment extends Fragment{

    int mCurrentPage;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /** Getting the arguments to the Bundle object */
        Bundle data = getArguments();

        /** Getting integer data of the key current_page from the bundle */
        mCurrentPage = data.getInt("current_page", 0);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.myfragment_layout, container,false);
        TextView textView1 = (TextView ) v.findViewById(R.id.textView1);
        TextView textView2 = (TextView ) v.findViewById(R.id.textView2);
        ImageView imageView = (ImageView) v.findViewById(R.id.imageView);
       textView1.setText("Id: "+ mCurrentPage);
        imageView.setImageResource(R.drawable.a1);
        textView2.setText("Contact Name: Abdullah Rafaqat" + "\n\n" + "Contact No.: 923434090928"+ "\n\n" +"Gender.: Male"+ "\n\n" + "Swipe Horizontally left / right");
        //imageView.setImageDrawable(Drawable.createFromPath("C:\\Users\\Abdullah\\AndroidStudioProjects\\ViewPager\\app\\src\\main\\res\\drawable\\a1.jpg"));
        //textView2.setText("Contact No.: 923434090928");
        return v;
    }

}