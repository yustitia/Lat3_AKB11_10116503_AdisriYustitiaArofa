package aplikasiadis.com;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;

import aplikasiadis.com.Adapter.DailyAdapter;
import aplikasiadis.com.Model.DailyModel;


public class DailyFragment extends Fragment {

    private RecyclerView mRecycleView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        final View myFragmentView = inflater.inflate(R.layout.fragment_daily, container, false);

        ArrayList<DailyModel> dailyModels = new ArrayList<>();
        dailyModels.add(new DailyModel(R.drawable.icon_aktivitas,"Pukul 04:00 - 04:30 bangun tidur"));
        dailyModels.add(new DailyModel(R.drawable.icon_aktivitas,"Pukul 04:30 - 05:15 mulai solat"));
        dailyModels.add(new DailyModel(R.drawable.icon_aktivitas,"Pukul 06:00 - 07:00 Sarapan Pagi"));
        dailyModels.add(new DailyModel(R.drawable.icon_aktivitas,"Pukul 07:00 - 11:45 melakukan yang di mau"));
        dailyModels.add(new DailyModel(R.drawable.icon_aktivitas,"Pukul 11:45 - 12:15 Sholat Dzuhur"));
        dailyModels.add(new DailyModel(R.drawable.icon_aktivitas,"Pukul 12:15 - 15:00 bermain bersama teman"));
        dailyModels.add(new DailyModel(R.drawable.icon_aktivitas,"Pukul 15:00 - 15:30 Sholat Ashar"));
        dailyModels.add(new DailyModel(R.drawable.icon_aktivitas,"Pukul 15:30 - 17:45 siap siap mandi"));
        dailyModels.add(new DailyModel(R.drawable.icon_aktivitas,"Pukul 17:45 - 18:30 Sholat Maghrib dan makan"));
        dailyModels.add(new DailyModel(R.drawable.icon_aktivitas,"Pukul 18:30 - 19:00 belajar atau nonton film"));
        dailyModels.add(new DailyModel(R.drawable.icon_aktivitas,"Pukul 19:00 - 19:30 Sholat Isya"));
        dailyModels.add(new DailyModel(R.drawable.icon_aktivitas,"Pukul 19:30 - 22:00 makan, cuci kaki, dan tidur "));


        mRecycleView = myFragmentView.findViewById(R.id.daily_id_r);
        mRecycleView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        mAdapter = new DailyAdapter(dailyModels);

        mRecycleView.setLayoutManager(mLayoutManager);
        mRecycleView.setAdapter(mAdapter);

        return myFragmentView;


    }

}
