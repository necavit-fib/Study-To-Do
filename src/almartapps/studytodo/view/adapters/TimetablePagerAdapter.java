package almartapps.studytodo.view.adapters;

import java.util.List;

import almartapps.studytodo.view.fragments.TodayClassesFragment;
import almartapps.studytodo.view.fragments.TodayTasksFragment;
import almartapps.studytodo.view.fragments.timetable.MondayFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TimetablePagerAdapter extends FragmentPagerAdapter {

	private final int PAGE_COUNT = 7;
	
	private List<String> pageTitles;
	
	public TimetablePagerAdapter(FragmentManager fm, List<String> pageTitles) {
		super(fm);
		this.pageTitles = pageTitles;
	}

	@Override
	public Fragment getItem(int position) {
		switch (position) {
		case 0: //classes
			Fragment mondayFragment = new MondayFragment();
			return mondayFragment;
		case 1: //tasks
			Fragment tasksFragment = new TodayTasksFragment();
			return tasksFragment;
		case 2: //classes
			Fragment classesFragment = new TodayClassesFragment();
			return classesFragment;
		/*case 3: //tasks
			Fragment tasksFragment = new TodayTasksFragment();
			return tasksFragment;
		case 4: //classes
			Fragment classesFragment = new TodayClassesFragment();
			return classesFragment;
		case 5: //tasks
			Fragment tasksFragment = new TodayTasksFragment();
			return tasksFragment;
		case 6: //classes
			Fragment classesFragment = new TodayClassesFragment();
			return classesFragment;*/
		}
		return null;
	}
	
	@Override
	public CharSequence getPageTitle(int position) {
		return pageTitles.get(position);
	}

	@Override
	public int getCount() {
		return PAGE_COUNT;
	}

}
