pipeline {
    agent any
    stages {
		
		
		// *****ALL CODE TO BE ADDED BELOW THIS COMMENT*****
		
			
		//Code starts for stage Clean
        stage('Clean') {
            steps {
				//sh 'chmod +x ./drivers/chromedriver'
                mvn clean
            }
        }
		//Code ends for stage Clean
		
		
		//Code starts for stage Build
		stage('Build') {
            steps {
                mvn test
            }
        }
		//Code ends for stage Build
		
		// *****ALL CODE TO BE ADDED ABOVE THIS COMMENT*****
    }
}