//package com.emp.qa.util;
//
//public class LastDownloadedExcel  {
//	
//
//	
//	
//	
//	protected File downloadsDir = new File("");
//	if (browser.equalsIgnoreCase("firefox")) 
//	{
//	    downloadsDir = new File(System.getProperty("user.dir") + File.separatorChar + "downloads");
//	    if (!downloadsDir.exists()) 
//	     {
//	        boolean ddCreated = downloadsDir.mkdir();
//	        if (!ddCreated) {
//	            System.exit(1);
//	        }
//	    }
//	}
//
//
//	/*Firefox browser profile*/
//	FirefoxProfile firefoxProfile = new FirefoxProfile();
//	firefoxProfile.setPreference("browser.download.folderList", 2);
//	firefoxProfile.setPreference("browser.download.manager.showWhenStarting", false);
//	firefoxProfile.setPreference("browser.download.dir", downloadsDir.getAbsolutePath());
//	firefoxProfile.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/plain,application/octet-stream");
//
//	**Empty the download directory[Can be implemented as @BeforeClass]:**
//
//	public void emptyDownloadsDir()
//	{
//	    // Verify downloads dir is empty, if not remove all files.
//	    File[] downloadDirFiles = downloadsDir.listFiles();
//	    if (downloadDirFiles != null) {
//	        for (File f : downloadDirFiles) {
//	            if (f.exists()) {
//	                boolean deleted = FileUtility.delete(f);
//	                assertTrue(deleted, "Files are not deleted from system local directory" + downloadsDir + ", skipping the download tests.");
//	            }
//	        }
//	    }
//	}
//
//
//	**Check the Latest downloaded file:**
//
//	/*Test file*/
//	protected static String EXCEL_FILE_NAME= Test_Excel_File.xls;
//
//	protected static int WAIT_IN_SECONDS_DOWNLOAD = 60;
//
//	// Wait for File download.
//	int counter = 0;
//	while (counter++ < WAIT_IN_SECONDS_DOWNLOAD && (downloadsDir.listFiles().length != 1 || downloadsDir.listFiles()[0].getName().matches(EXCEL_FILE_NAME))) {
//	    this.wait(2);
//	}
//
//	// Verify the downloaded File by comparing name.
//	File[] downloadDirFiles = downloadsDir.listFiles();
//	String actualName = null;
//	for (File file : downloadDirFiles) {
//	    actualName = file.getName();
//	    if (actualName.equals(EXCEL_FILE_NAME)) {
//	        break;
//	    }
//	}
//	assertEquals(actualName, EXCEL_FILE_NAME, "Last Downloaded File name does not matches.");
//	
//	
//	
//	
//	
//	
//
//	
//}
//}
//}
