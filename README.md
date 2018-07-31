# AndroidLTHelper
An Android library to help write log messages and Toasts.

## How to:

To get a Git project into your build:

### Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  

### Step 2. Add the dependency

	dependencies {
		implementation 'com.github.Tobibur:AndroidLTHelper:0.1.1'
	}

[![](https://jitpack.io/v/Tobibur/AndroidLTHelper.svg)](https://jitpack.io/#Tobibur/AndroidLTHelper)

## Usage

### For Log messages
#### 1. Create a LogHelper class object
```Java
private LogHelper lh = new LogHelper(TAG);
```
Here `TAG` is the String value TAG for Log.
Example:`String TAG = "MainActivity";`

#### 2. For Log.d (Debug) use:
```Java
lh.debug("Debug is working");
```

#### 3. For Log.i (Info) use:
```Java
lh.infos("Info is working");
```

### For Toast messages
#### 1. Create a ToastHelper class object.
```Java
 private ToastHelper th = new ToastHelper(this);
 ```
 Here `this` is the context.
 
#### 2. For short length Toast use:
```Java
th.toast("This is short msg");
```

#### 3. For long length Toast use:
```Java
th.toastlong("This is long msg");
```

Thats it! :)

## License & Copyright
Licensed under the [MIT Licence](LICENSE)
