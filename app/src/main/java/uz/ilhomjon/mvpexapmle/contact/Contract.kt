package uz.ilhomjon.mvpexapmle.contact

//bu interface 3 ta model, view, presenter qismlarni bog'lovchi
interface Contract {

	//dizayn qismini hozirgi holatda MainActivity boshqaradi
	interface View {
		fun showProgress()
		fun hideProgress()
		fun setString(string: String?)
	}

	//malumotlar sqalanadigan joy. Hozirgi holatda Model classi
	interface Model {
		interface OnFinishedListener {
			fun onFinished(string: String?)
		}
		fun getNextCourse(onFinishedListener: OnFinishedListener?)
	}

	//model va view ni bog'lovchi nazorat qiluvchi, Hozirgi holatda Presenter classi
	interface Presenter {
		fun onButtonClick()
		fun onDestroy()
	}
}