package com.example.singleactivityapp.firsttier;

import com.example.singleactivityapp.Home;
import com.example.singleactivityapp.base.SecondTierFragment;


public abstract class FirstTierFragment extends SecondTierFragment {

	@Override
	public void onStart() {
		super.onStart();
		
		// Not recommended approach. Tightly couples this fragment
		// with Home. Check this same thing being done in SecondTierFragment
		// using inter-fragment communication.
		((Home) getActivity()).setSelectedBaseFragment(this);
	}
}
