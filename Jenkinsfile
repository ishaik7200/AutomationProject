pipeline {
    agent any
    stages {
		
		
		// *****ALL CODE TO BE ADDED BELOW THIS COMMENT*****
		
			
		//Code starts for stage Clean
        stage('Clean') {
            steps {
				sh 'chmod +x /var/jenkins_home/workspace/AutomationProject/drivers/chromedriver'
                sh 'mvn clean'
            }
        }
		//Code ends for stage Clean
		
		
		//Code starts for stage Build
		stage('Build') {
            steps {
                sh 'mvn test'
            }
        }
		//Code ends for stage Build
		
		// *****ALL CODE TO BE ADDED ABOVE THIS COMMENT*****
    }
}