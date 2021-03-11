<script type='module' src="https://kag0.github.io/sauce/sauce.js">
<h1>If you're reading this, click <a href="https://kag0.github.io/autosome">HERE</a></h1>
</script>

> magnet for more ergonomic optional parameters

## Callers don't need to wrap parameters in `Some`

<sauce-code
  repo='kag0/autosome'
  file='autosome/test/src/io/github/kag0/autosome/test/Examples.scala'
  lines='7:10'
  lang='scala'
></sauce-code>

## `AutoSome` values can be passed as `Option`s

<sauce-code
repo='kag0/autosome'
file='autosome/test/src/io/github/kag0/autosome/test/Examples.scala'
lines='14:17'
lang='scala'
></sauce-code>

## Pattern match without nested `Some`/`None`

<sauce-code
repo='kag0/autosome'
file='autosome/test/src/io/github/kag0/autosome/test/Examples.scala'
lines='21:25'
lang='scala'
></sauce-code>

## Invoke methods on `AutoSome` as if it were `Option`

<sauce-code
repo='kag0/autosome'
file='autosome/test/src/io/github/kag0/autosome/test/Examples.scala'
lines='27:28'
lang='scala'
></sauce-code>

## Concise default parameters

<sauce-code
repo='kag0/autosome'
file='autosome/test/src/io/github/kag0/autosome/test/Examples.scala'
lines='30:30'
lang='scala'
></sauce-code>