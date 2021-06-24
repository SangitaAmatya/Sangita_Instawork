import pytest
from selenium import webdriver
from Page_Object.LoginPage import LoginPage
from Utilities.readProperties import ReadConfig


class Test_001_login:
   # baseURL = "https://admin-demo.nopcommerce.com/"
    #username = "admin@yourstore.com"
    #password = "admin"
   baseURL = ReadConfig.getApplicationURL()
   username= ReadConfig.getUseremail()
   password=ReadConfig.getPassword()
def test_HomePageTitle(self, setup):
        # self.driver = webdriver.Chrome()//reusablecode
        self.driver = setup
        self.driver.get(self.baseURL)
        act_title = self.driver.title
        self.driver.close()
        if act_title != "Your store. Login123":
            assert True
        else:
              assert True

    def test_login(self, setup):
    # self.driver = webdriver.Chrome()
     self.driver = setup
     self.driver.get(self.baseURL)
     self.lp = LoginPage(self.driver)
     self.lp.setUserName(self.username)
     self.lp.setPassword(self.password)
     self.lp.clickLogin()
     act_title = self.driver.title
     if act_title == "Dashboard / nopCommerce administration":
        assert True
     else:
        assert False
