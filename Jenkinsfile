node {
   def mvnHome
   def scannerHome
   def dockerHome
   stage('Setup') { 

      // Get the Maven tool.
      // ** NOTE: This 'M3' Maven tool must be configured
      // **       in the global configuration.           
      mvnHome = tool 'maven3.5.2'
      scannerHome = tool 'sonarqube3.0'
      dockerHome = tool 'docker'
      

   }

   stage('Code') {
      git 'https://github.com/HarveyHe/gdemo.git'
   }


   stage('Build') {
      // Run the maven build
      sh "'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore clean package"
   }
   stage('Unit Test') {
        echo 'TOTO:Test using mvn test'
        //sh "'${mvnHome}/bin/mvn' test"
    }

   stage('Code Sonar Analysis') {

        echo 'TOTO: https://testerhome.com/topics/10323'
        echo 'mvn sonar:sonar'
   
        def sonarqubeScannerHome = tool 'sonarqube3.0'

        withSonarQubeEnv('sonar') {
            sh "${sonarqubeScannerHome}/bin/sonar-scanner -Dsonar.login=admin -Dsonar.password=admin"
        }
         
   
    }

   stage('Cucumber Test') {
      sh "'${mvnHome}/bin/mvn'  -Dtest=RunTest2 test"
      cucumber fileIncludePattern: '**/*.json', jsonReportDirectory: 'target'     
   }
    
    stage('Release') {

        echo 'Release'
      
    }
    stage('Deploy') {
   
        echo 'Deploy'
      
    }
    stage('Cleanup') {
     	echo 'Cleanup'
        //cleanWs(deleteDirs: true)
        //sh 'docker rmi -f $(docker images |grep \'lfs-terminal\'|awk {\'print $3\'})'
      
    }
}