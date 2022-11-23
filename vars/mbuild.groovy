def call(args){
  sh "${tool 'maven-3.8.6'}/bin/mvn ${args}"
}
