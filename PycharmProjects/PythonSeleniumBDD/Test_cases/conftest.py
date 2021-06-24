import pytest
from selenium import webdriver


@pytest.fixture()
def setup():
    from webdriver_manager.chrome import ChromeDriverManager

    driver = webdriver.Chrome(ChromeDriverManager().install())
    return driver
