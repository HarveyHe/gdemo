node {
   def mvnHome
   def scannerHome
   def dockerHome
   stage('Setup') { 
         
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
  
}