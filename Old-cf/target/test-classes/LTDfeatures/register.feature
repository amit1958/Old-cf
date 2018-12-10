require 'csv'
# Login with valid user name and password
Given /^Go to Login Url for Registration$/ do
 visit $url
end

When /^Submit the form without enter any value.$/ do
   click_button('Register')
   sleep 3
   end
   

Then /^First name should come as "(.*)"$/ do |msg|
	FN_Validation =false 
	if page.has_content? msg
		FN_Validation= true
	end
	assert FN_Validation
	
end

And /^Last name as "(.*)"$/ do |msg|
	LN_Validation =false 
	if page.has_content? msg
		LN_Validation= true
	end
	assert LN_Validation
end

And /^Firm Name as "(.*)"$/ do |msg|
	Firm_Validation =false 
	if page.has_content? msg
		Firm_Validation= true
	end
	assert Firm_Validation
end

And /^Mobile number as "(.*)"$/ do |msg|
	M_Validation =false 
	if page.has_content? msg
		M_Validation= true
	end
	assert M_Validation
end

And /^Passcode as "(.*)"$/ do |msg|
	Passcode_Validation =false 
	if page.has_content? msg
		Passcode_Validation= true
	end
	assert Passcode_Validation
end


And /^PinCode as "(.*)"$/ do |msg|
	PinCode_Validation =false 
	if page.has_content?  msg
		PinCode_Validation= true
	end
	assert PinCode_Validation
end

#Registration with Valid Information
When /^Fill all required fields.$/ do
CSV.foreach("D:\\Cucumber\\features\\csv_files\\Registration.csv", :headers => true, :col_sep => ',') do |row|
   fill_in('firstName', :with => row['firstName'])
   fill_in('lastName', :with => row['lastName'])
   fill_in('company', :with => row['company'])
   fill_in('mobile', :with => row['mobile'])
   fill_in('numbersonly', :with => row['numbersonly'])
   fill_in('pinCode', :with => row['pinCode'])
   fill_in('username', :with => row['username'])
    fill_in('referralCode', :with => row['referralCode'])
   click_button('Register')

   end
   sleep(10)
   click_button('Close')
end

Then /^Page should come with "(.*)"$/ do |reg|
	Res_success =false 
	if page.has_content? (reg)
		Res_success= true
	end
	assert Res_success
end
