# Clear-Country-Code-picker

**Step 1.** Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:
```gradle
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

**Step 2.** Add the dependency
```gradle
dependencies {
    implementation 'com.github.torindev:Clear-Country-Code-picker:1.0.0'
}
```

### Usage

```java
List<Country> countryList = CountryUtils.getAllCountries(context).size())
```

#### This is it!!
  
  
