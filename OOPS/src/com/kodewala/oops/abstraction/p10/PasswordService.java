package com.kodewala.oops.abstraction.p10;

public class PasswordService {
	 private String password = "old1234" ;
	public void changePassword(String oldPassword, String newPassword) {
		if (validateOldPassword(oldPassword)
                && validateNewPassword(newPassword)) {

            updatePassword(newPassword);

            System.out.println("Password changed successfully!");
        } else 
        	System.out.println("Password change failed!");
	}

	private void updatePassword(String _newPassword) {
		password = _newPassword;
	}

	private boolean validateNewPassword(String _newPassword) {
		return _newPassword != null && _newPassword.length() >=8 ;
	}

	private boolean validateOldPassword(String _oldPassword) {
		return password.equals(_oldPassword);
	}

}
