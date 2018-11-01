package TestCase;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Common.Logo;
import Common.ScreenShot;
import Common.logs;
import TestNG_Package.Base_Class;


public class Pre_Login_Home extends Base_Class {

	@Test
	public void PreLoginHeader_HomePage() throws InterruptedException
	{
		Logo l = new Logo(driver,pr);
		ScreenShot s = new ScreenShot(driver, pr);
		Actions a = new Actions(driver);
		l.VerifyAndClickOnLogo();
		logs.log_generate("Logo is displaying on home page and is clickable too", "PreLoginHeader_HomePage");
		
	
		Assert.assertTrue(driver.findElementByXPath(pr.getProperty("Seller_Login")).isDisplayed());
		logs.log_generate("Seller_Login link is displaying on home page and is clickable too", "PreLoginHeader_HomePage");
		Assert.assertTrue(driver.findElementByXPath(pr.getProperty("Download_App")).isDisplayed());
		logs.log_generate("Download App link is displaying on home page and is clickable too", "PreLoginHeader_HomePage");
		Assert.assertTrue(driver.findElementByXPath(pr.getProperty("Phone_Number")).isDisplayed());
		logs.log_generate("Phone number in header is displaying on home page and is clickable too", "PreLoginHeader_HomePage");
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Search_Field")).isDisplayed());
		logs.log_generate("Searh field is displaying on home page and is clickable too", "PreLoginHeader_HomePage");
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Search_Btn")).isDisplayed());
		logs.log_generate("Search button is displaying on home page and is clickable too", "PreLoginHeader_HomePage");
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Wallet")).isDisplayed());
		logs.log_generate("Wallet icon is displaying on home page and is clickable too", "PreLoginHeader_HomePage");
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Cart")).isDisplayed());
		logs.log_generate("Cart icon is displaying on home page and is clickable too", "PreLoginHeader_HomePage");
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Login_register")).isDisplayed());
		logs.log_generate("Login and register link is displaying on home page and is clickable too", "PreLoginHeader_HomePage");

		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("ShopByCategory")).isDisplayed());
		a.moveToElement(driver.findElementByCssSelector(pr.getProperty("ShopByCategory"))).moveToElement(driver.findElementByCssSelector(pr.getProperty("ShopByCategory_Batteries"))).build().perform();
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("ShopByCategory_Batteries_TwoWheelers")).isDisplayed());
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("ShopByCategory_Batteries_ThreeWheelers")).isDisplayed());
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("ShopByCategory_Batteries_FourWheelers")).isDisplayed());
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("ShopByCategory_Batteries_InverterBatteries")).isDisplayed());
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("ShopByCategory_Batteries_UpsBatteries")).isDisplayed());
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("ShopByCategory_Batteries_SolarBatteries")).isDisplayed());
		
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("ShopByCategory_Inverters")).isDisplayed());
		a.moveToElement(driver.findElementByCssSelector(pr.getProperty("ShopByCategory_Inverters"))).build().perform();
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("ShopByCategory_Inverters_SineWave")).isDisplayed());
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("ShopByCategory_Inverters_SquareWave")).isDisplayed());
		
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("ShopByCategory_SolarPanel")).isDisplayed());
		
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("ShopByCategory_MobileAndAccesssaries")).isDisplayed());
		
		a.moveToElement(driver.findElementByCssSelector(pr.getProperty("ShopByCategory_MobileAndAccesssaries"))).build().perform();
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("ShopByCategory_MobileAndAccesssaries_Mobiles")).isDisplayed());
		
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("ShopByCategory_Electricals")).isDisplayed());
		
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Bateries")).isDisplayed());
		a.moveToElement(driver.findElementByCssSelector(pr.getProperty("Bateries"))).moveToElement(driver.findElementByCssSelector(pr.getProperty("Bateries_TwoWheelers"))).build().perform();
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Bateries_TwoWheelers_Motorcycle")).isDisplayed());	
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Bateries_TwoWheelers_Scooter")).isDisplayed());
		
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Bateries_ThreeWheelers")).isDisplayed());
		a.moveToElement(driver.findElementByCssSelector(pr.getProperty("Bateries_ThreeWheelers"))).build().perform();
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Bateries_ThreeWheelers_Erikshaw")).isDisplayed());	
		
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Bateries_FourWheelers")).isDisplayed());
		a.moveToElement(driver.findElementByCssSelector(pr.getProperty("Bateries_FourWheelers"))).build().perform();
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Bateries_FourWheelers_CarBatteries")).isDisplayed());
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Bateries_FourWheelers_CommercialVehicleBatteries")).isDisplayed());
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Bateries_FourWheelers_CraneBatteries")).isDisplayed());
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Bateries_FourWheelers_TractorBatteries")).isDisplayed());
		
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Bateries_InverterBatteries")).isDisplayed());
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Bateries_UpsBatteries")).isDisplayed());
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Bateries_SolarBatteries")).isDisplayed());
		
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("MobileAndAccessaries")).isDisplayed());
		a.moveToElement(driver.findElementByCssSelector(pr.getProperty("MobileAndAccessaries"))).moveToElement(driver.findElementByCssSelector(pr.getProperty("MobileAndAccessaries_Mobiles"))).build().perform();
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("MobileAndAccessaries_Mobiles_SmartPhone")).isDisplayed());
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("MobileAndAccessaries_Mobiles_FeaturePhones")).isDisplayed());

		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("MobileAndAccessaries_Accessaries")).isDisplayed());
		a.moveToElement(driver.findElementByCssSelector(pr.getProperty("MobileAndAccessaries_Accessaries"))).build().perform();
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("MobileAndAccessaries_Accessaries_PowerBanks")).isDisplayed());
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("MobileAndAccessaries_Accessaries_Batteries")).isDisplayed());
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("MobileAndAccessaries_Accessaries_Chargers")).isDisplayed());
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("MobileAndAccessaries_Accessaries_EarPhones")).isDisplayed());
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("MobileAndAccessaries_Accessaries_HeadPhones")).isDisplayed());
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("MobileAndAccessaries_Accessaries_MobileCables")).isDisplayed());
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("MobileAndAccessaries_Accessaries_Speakers")).isDisplayed());
		
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Electricals")).isDisplayed());
		a.moveToElement(driver.findElementByCssSelector(pr.getProperty("Electricals"))).moveToElement(driver.findElementByCssSelector(pr.getProperty("Electricals_Accesssaries"))).build().perform();
		
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Electricals_Accesssaries_Wires")).isDisplayed());
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Electricals_Accesssaries_Cables")).isDisplayed());
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Electricals_Accesssaries_SwithcesAndSockets")).isDisplayed());
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Electricals_Accesssaries_Swithgears")).isDisplayed());
		
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Electricals_Appliances")).isDisplayed());
		a.moveToElement(driver.findElementByCssSelector(pr.getProperty("Electricals_Appliances"))).build().perform();
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Electricals_Appliances_MixerGrinders")).isDisplayed());
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Electricals_Appliances_Irons")).isDisplayed());
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Electricals_Appliances_Pumps")).isDisplayed());
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Electricals_Appliances_Geysers")).isDisplayed());
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Electricals_Appliances_Stabilizers")).isDisplayed());
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Electricals_Appliances_Fans")).isDisplayed());
		a.moveToElement(driver.findElementByCssSelector(pr.getProperty("Electricals_Appliances_Fans"))).build().perform();
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Electricals_Appliances_Fans_CeilingFans")).isDisplayed());
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Electricals_Appliances_Fans_TablesFans")).isDisplayed());
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Electricals_Appliances_Fans_ExhaustFans")).isDisplayed());
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Electricals_Appliances_Fans_PedestalFans")).isDisplayed());
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Electricals_Appliances_Fans_Wallfans")).isDisplayed());
		
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Electricals_Lights")).isDisplayed());
		a.moveToElement(driver.findElementByCssSelector(pr.getProperty("Electricals_Lights"))).build().perform();
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Electricals_Lights_LedBulbs")).isDisplayed());
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Electricals_Lights_DownLights")).isDisplayed());
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Electricals_Lights_OutdoorLights")).isDisplayed());
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Electricals_Lights_TubeLights")).isDisplayed());
		
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Inverters")).isDisplayed());
		a.moveToElement(driver.findElementByCssSelector(pr.getProperty("Inverters"))).build().perform();
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Inverters_SineWave")).isDisplayed());
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Inverters_SquareWave")).isDisplayed());
		
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Solar")).isDisplayed());
		a.moveToElement(driver.findElementByCssSelector(pr.getProperty("Solar"))).moveToElement(driver.findElementByCssSelector(pr.getProperty("Solar_SolarAccessaries"))).build().perform();
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Solar_SolarAccessaries_SolarChargeControllers")).isDisplayed());
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Solar_SolarAccessaries_SolarInverters")).isDisplayed());
		
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Solar_SolarLights")).isDisplayed());
		a.moveToElement(driver.findElementByCssSelector(pr.getProperty("Solar_SolarLights"))).build().perform();
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Solar_SolarLights_SolarEmergencyLights")).isDisplayed());
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Solar_SolarLights_SolarStreetLights")).isDisplayed());
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Solar_SolarLights_SolarLightiningSystems")).isDisplayed());
		
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Solar_SolarWaterHeater")).isDisplayed());
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Solar_SolarPanel")).isDisplayed());
		a.moveToElement(driver.findElementByCssSelector(pr.getProperty("Solar_SolarPanel"))).build().perform();
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Solar_SolarPanel_MonocrystallineSolarPanels")).isDisplayed());
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Solar_SolarPanel_PolycrystallineSolarPanels")).isDisplayed());	
		
		if(driver.findElementByCssSelector(pr.getProperty("Deals")).isDisplayed())
		{
			a.moveToElement(driver.findElementByCssSelector(pr.getProperty("Deals"))).build().perform();
			Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Deals_Banners")).isDisplayed());		
		}
		
	}	
}
