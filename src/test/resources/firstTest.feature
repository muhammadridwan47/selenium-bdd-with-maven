@critical
Feature: Web login
  @regression @smoke @functional
  Scenario: User should be able to login with valid credentials
    Given the user is on login page
    When the user enters valid credentials
    And hits submit
    Then the user should be logged in successfully

  @functional @regression
  Scenario: User should not be able to login with invalid credentials
    Given the user is on login page
    When the user enters invalid credentials
    And hits submit
    When an invalid credentials error message should be displayed to the user
    And the user should be logged in unsuccessfully

  @ui @regression
  Scenario: Check for login page
    Given the user is on login page
    Then the company logo should be present in the login form



#  https://www.linkedin.com/pulse/apa-sih-perbedaan-sanity-smoke-regression-testing-rahmat-sasongko/?originalSubdomain=id
#  Smoke Testing:
#  Smoke Testing adalah pengujian yang berfokus pada perangkat lunak secara keseluruhan,
#  namun hanya berfokus pada main function, biasanya mengutamakan positif case,
#  namun tidak menutup kemungkinan dilakukan pada negatif case yang sifatnya critical.
#  Tujuan dari smoke testing ini adalah untuk reject aplikasi yang sudah rusak sejak awal development,
#  sehingga tim QA tidak banyak membuang-buang waktu menginstal dan menguji aplikasi perangkat lunak.


#  Regression Testing?
#  Regression Testing adalah pengujian terhadap perangkat lunak secara menyeluruh dan sedetail mungkin.
#  Tujuan dari regression testing untuk memastikan bahwa perubahan kode baru seharusnya tidak memiliki efek samping pada fungsi yang ada,
#  sehingga dapat dipastikan bahwa kode lama masih berfungsi setelah perubahan kode terbaru dilakukan.


#  Sanity Testing
#  Sanity Testing adalah pengujian yang dilakukan terhadap sebuah perangkat lunak dan hanya berfokus pada feature
#  atau fungsi baru atau fungsi yang dilakukan perubahan, baik perubahan itu merupakan perubahan flow bisnis atau
#  perubahan karena ditemukannya kesalahan atau bugs pada perangkat lunak versi sebelumnya.Tujuan dari sanity testing ini tentunya untuk memastikan
#  bahwa bug-bug yang telah di perbaiki pada saat smoke testing sudah selesai diperbaiki dan tidak ada masalah lebih lanjut serta
#  untuk menentukan bahwa fungsi yang diinginkan bekerja seperti yang diharapkan.