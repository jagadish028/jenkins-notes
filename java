pipeline {
      agent any
          stages {
              stage ('build') {
                  sh '''
                      https://github.com/jagadish028/java-project.git
                      mvn clean install
                      '''
              }
         
          }
}
